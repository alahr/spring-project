package com.alahr.springproject.mybatis.dao;

import com.alahr.springproject.mybatis.dto.Animal;

public interface AnimalMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Animal record);

    int insertSelective(Animal record);

    Animal selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Animal record);

    int updateByPrimaryKey(Animal record);
}