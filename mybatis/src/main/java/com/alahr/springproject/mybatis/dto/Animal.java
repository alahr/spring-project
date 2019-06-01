package com.alahr.springproject.mybatis.dto;

import java.util.Date;

public class Animal {
    private Long id;

    private String name;

    private String type;

    private Date birthday;

    private String gender;

    private String owner;

    public Animal(Long id, String name, String type, Date birthday, String gender, String owner) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.birthday = birthday;
        this.gender = gender;
        this.owner = owner;
    }

    public Animal() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
        this.gender = gender == null ? null : gender.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }
}