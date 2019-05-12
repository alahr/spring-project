package com.alahr.springproject.mybatis.dto;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.Date;

public class PersonDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String card;
    private Date birthday;
    private String gender;
    private String address;

    public Long getId() {
        return id;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
