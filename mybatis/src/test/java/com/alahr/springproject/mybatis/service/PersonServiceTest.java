package com.alahr.springproject.mybatis.service;


import com.alahr.springproject.mybatis.dto.PersonDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonServiceTest {
    @Autowired
    private PersonService personService;

    @Test
    public void get(){
        PersonDTO dto = personService.getByCard("1001");
        System.out.println(dto.toString());
    }

    @Test
    public void add(){
        PersonDTO dto = new PersonDTO();
        dto.setName("唐僧");
        dto.setAddress("陈家庄");
        personService.add(dto);
    }

    @Test
    public void updateByCard(){
        PersonDTO dto = new PersonDTO();
        dto.setCard("1002");
        dto.setName("唐僧");
        dto.setGender("2");
        dto.setBirthday(new Date());
        dto.setAddress("陈家庄");
        personService.updateByCard(dto);
    }
    @Test
    public void tans(){
        PersonDTO dto = new PersonDTO();
        dto.setCard("1006");
        dto.setName("五天33333");
        dto.setGender("1");
        dto.setBirthday(new Date());
        dto.setAddress("敏捷333");
        personService.tans(dto);
    }
}
