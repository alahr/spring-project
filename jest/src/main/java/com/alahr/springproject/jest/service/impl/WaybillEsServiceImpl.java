package com.alahr.springproject.jest.service.impl;

import com.alahr.springproject.jest.constant.EsConstant;
import com.alahr.springproject.jest.model.WaybillEsDO;
import com.alahr.springproject.jest.model.page.PageDTO;
import com.alahr.springproject.jest.param.WaybillEsParam;
import com.alahr.springproject.jest.service.WaybillEsService;
import com.alahr.springproject.jest.util.JestClientUtil;
import io.searchbox.client.JestClient;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import io.searchbox.strings.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class WaybillEsServiceImpl implements WaybillEsService {

    @Value("${es.jest.url}")
    private String esUrl;


    @Override
    public PageDTO<List<WaybillEsDO>> queryByPage(WaybillEsParam param) {
        if(param == null){
            return PageDTO.of(1,1, Collections.EMPTY_LIST);
        }
        if(param.getCurrentPage() == null || param.getCurrentPage() < 0){
            param.setCurrentPage(0);
        }
        if(param.getPageSize() == null || param.getPageSize() < 0){
            param.setPageSize(10);
        }
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        //设置查询参数
        if (StringUtils.isNotBlank(param.getWaybillNo())) {
            //运单号
            boolQueryBuilder.must(QueryBuilders.matchQuery("waybillNo", param.getWaybillNo()));
        }
        if (StringUtils.isNotBlank(param.getPickupScanTimeStart())) {
            //激活开始时间
            boolQueryBuilder.must(QueryBuilders.rangeQuery("pickupScanTime").gte(param.getPickupScanTimeStart()));
        }
        if (StringUtils.isNotBlank(param.getPickupScanTimeEnd())) {
            //激活结束时间
            boolQueryBuilder.must(QueryBuilders.rangeQuery("pickupScanTime").lte(param.getPickupScanTimeEnd()));
        }

        try{
            int pageNumber = param.getCurrentPage();
            int pageSize = param.getPageSize();

            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
            searchSourceBuilder.query(boolQueryBuilder);
            // 设置分页
            searchSourceBuilder.from(pageNumber * pageSize);//设置起始页
            searchSourceBuilder.size(pageSize);//设置页大小
            List<WaybillEsDO> waybillEsDTOList = queryInEs(searchSourceBuilder.toString());
            return PageDTO.of(pageNumber + 1, pageSize, waybillEsDTOList);
        }catch (Exception e) {
            e.printStackTrace();
            return PageDTO.of(1, 10, Collections.EMPTY_LIST);
        }
    }

    @Override
    public List<WaybillEsDO> queryByWaybillNo(List<String> waybillNoList) {
        if(CollectionUtils.isEmpty(waybillNoList)){
            return Collections.emptyList();
        }
        try{
            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
            searchSourceBuilder.query(QueryBuilders.termsQuery("waybillNo", waybillNoList));
            return queryInEs(searchSourceBuilder.toString());
        }catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public List<WaybillEsDO> queryInEs(String query){
        if(StringUtils.isBlank(query)){
            return Collections.EMPTY_LIST;
        }
        try {
            Search search = new Search.Builder(query)
                    .addIndex(EsConstant.INDEX_WAYBILL)
                    .addType(EsConstant.TYPE_WAYBILL)
                    .build();
            JestClient jestClient = JestClientUtil.getClient(esUrl);
            SearchResult result = jestClient.execute(search);
            List<SearchResult.Hit<WaybillEsDO, Void>> hits = result.getHits(WaybillEsDO.class);

            List<WaybillEsDO> waybillEsDTOList = new ArrayList<>();
            for (SearchResult.Hit<WaybillEsDO, Void> hit : hits) {
                WaybillEsDO dto = hit.source;
                waybillEsDTOList.add(dto);
            }
            return waybillEsDTOList;
        } catch (Exception e){
            e.printStackTrace();
            return Collections.EMPTY_LIST;
        }

    }
}
