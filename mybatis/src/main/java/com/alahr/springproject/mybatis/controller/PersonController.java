package com.alahr.springproject.mybatis.controller;

import com.alahr.springproject.mybatis.dto.PersonDTO;
import com.alahr.springproject.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping(value = "/get")
    public PersonDTO get(@RequestParam("card")String card){
        return personService.getByCard(card);
    }
}
