package com.service;

import com.dao.TestDao;
import com.dao.TestDaoImpl;
import com.domain.TestBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class TestServiceImpl  implements  TestService{
    private TestDao dao;

    public void setDao(TestDao dao) {
        this.dao = dao;
    }

    @Transactional
    public List<TestBean> getlist(){
        List<TestBean> list = dao.getList();
        return list;

    }
}
