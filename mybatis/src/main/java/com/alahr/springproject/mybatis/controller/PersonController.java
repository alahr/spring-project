package com.alahr.springproject.mybatis.controller;

import com.alahr.springproject.mybatis.dto.PersonDTO;
import com.alahr.springproject.mybatis.service.PersonService;
import com.alahr.springproject.mybatis.vo.PersonVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping(value = "/get")
    public PersonDTO get(@RequestParam("card")String card){
        return personService.getByCard(card);
    }

    @PostMapping(value = "/page")
    public PageInfo<PersonDTO> page(@RequestBody PersonVo vo){
        return personService.selectByPage(vo);
    }

}
