package com.alahr.springproject.jest.service;

import com.alahr.springproject.jest.model.WaybillEsDO;
import com.alahr.springproject.jest.model.page.PageDTO;
import com.alahr.springproject.jest.param.WaybillEsParam;

import java.util.List;

public interface WaybillEsService {
    PageDTO<List<WaybillEsDO>> queryByPage(WaybillEsParam param);

    List<WaybillEsDO> queryByWaybillNo(List<String> waybillNoList);

}
