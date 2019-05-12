package com.alahr.springproject.mybatis.service;

import com.alahr.springproject.mybatis.dto.PersonDTO;

public interface PersonService {
    PersonDTO getByCard(String card);

    int add(PersonDTO dto);

    int updateByCard(PersonDTO dto);

    void tans(PersonDTO dto);
}
