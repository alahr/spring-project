package com.alahr.springproject.mybatis.service;

import com.alahr.springproject.mybatis.dto.PersonDTO;
import com.alahr.springproject.mybatis.vo.PersonVo;
import com.github.pagehelper.PageInfo;

public interface PersonService {
    PersonDTO getByCard(String card);

    PageInfo<PersonDTO> selectByPage(PersonVo vo);

    int add(PersonDTO dto);

    int updateByCard(PersonDTO dto);

    void tans(PersonDTO dto);
}
