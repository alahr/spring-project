package com.alahr.springproject.jest.service;


import com.alahr.springproject.jest.model.WaybillEsDO;
import com.alahr.springproject.jest.model.page.PageDTO;
import com.alahr.springproject.jest.param.WaybillEsParam;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WaybillEsServiceTest {
    @Autowired
    private WaybillEsService waybillEsService;

    @Test
    public void query(){
        List<WaybillEsDO> waybillEsDOS = waybillEsService.queryByWaybillNo(Arrays.asList("W001001"));
        System.out.println(JSON.toJSONString(waybillEsDOS));
    }

    @Test
    public void queryByPage(){
        WaybillEsParam param = new WaybillEsParam();
        PageDTO<List<WaybillEsDO>> listPageDTO = waybillEsService.queryByPage(param);
        System.out.println(JSON.toJSONString(listPageDTO));
    }

    @Test
    public void save(){
        WaybillEsDO entity = new WaybillEsDO();
        entity.setId(12345678L);
        entity.setWaybillNo("W001001");
        entity.setMasterWaybillNo("M001");
        entity.setPickupScanTime("2019-10-15 19:15:30");
        entity.setWaybillStatus("Y");
        boolean result = waybillEsService.save(entity);
        System.out.println(JSON.toJSONString(result));
    }
}
