package com.alahr.springproject.mybatis.service.impl;

import com.alahr.springproject.mybatis.dao.PersonMapper;
import com.alahr.springproject.mybatis.dto.PersonDTO;
import com.alahr.springproject.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public PersonDTO getByCard(String card) {
        return personMapper.getByCard(card);
    }

    @Override
    public int add(PersonDTO dto) {
        return personMapper.add(dto);
    }

    @Override
    public int updateByCard(PersonDTO dto) {
        return personMapper.updateByCard(dto);
    }

    /**
     * 验证事物回滚
     * 先更新数据，再插入一条同样的数据；由于插入时唯一键重复，则更新的数据回滚
     * 异常前的更新数据，在数据库不可见
     *
     * @param dto
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void tans(PersonDTO dto){
        try {
            updateByCard(dto);
            add(dto);
        } catch (Exception e){
            e.printStackTrace();
            //事物回滚需在此处主动调用
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
    }
}
