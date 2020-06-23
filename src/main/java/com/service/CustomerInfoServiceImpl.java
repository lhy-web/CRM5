package com.service;

import com.dao.CustomerInfoDao;
import com.domain.Customerinfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CustomerInfoServiceImpl implements CustomerInfoService {
    private CustomerInfoDao dao;

    public void setDao(CustomerInfoDao dao) {
        this.dao = dao;
    }
    @Transactional
    public List<Customerinfo> findAll() {
        List<Customerinfo> list = dao.findAll();
        return list;
    }
}
