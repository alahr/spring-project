package com.alahr.springproject.mybatis.dao;

import com.alahr.springproject.mybatis.dto.PersonDTO;

public interface PersonMapper {
    PersonDTO getByCard(String card);

    int add(PersonDTO dto);

    int updateByCard(PersonDTO dto);
}
