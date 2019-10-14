package com.alahr.springproject.mybatis.dao;

import com.alahr.springproject.mybatis.dto.PersonDTO;
import com.alahr.springproject.mybatis.vo.PersonVo;

import java.util.List;

public interface PersonMapper {
    List<PersonDTO> selectByCondition(PersonVo vo);

    PersonDTO getByCard(String card);

    int add(PersonDTO dto);

    int updateByCard(PersonDTO dto);
}
