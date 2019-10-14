package com.alahr.springproject.mybatis.vo;

import com.alahr.springproject.mybatis.vo.base.PageVo;

import java.io.Serializable;

public class PersonVo extends PageVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String card;
    private String birthdayStart;
    private String birthdayEnd;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getBirthdayStart() {
        return birthdayStart;
    }

    public void setBirthdayStart(String birthdayStart) {
        this.birthdayStart = birthdayStart;
    }

    public String getBirthdayEnd() {
        return birthdayEnd;
    }

    public void setBirthdayEnd(String birthdayEnd) {
        this.birthdayEnd = birthdayEnd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
