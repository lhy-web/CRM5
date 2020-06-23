package com.service;

import com.dao.CustomerInfoDao;
import com.domain.CustomerLevel;
import com.domain.Customerinfo;
import com.domain.DictionaryTypeInfo;
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
    @Transactional
    public List<CustomerLevel> getCustomerLevel() {
        List<CustomerLevel> list = dao.getCustomerLevel();
        return list;
    }
    @Transactional
    public List<DictionaryTypeInfo> getCustomerProperties() {
        List<DictionaryTypeInfo> list = dao.getCustomerProperties();
        return list;
    }
    @Transactional
    public List<DictionaryTypeInfo> getCustomerType() {
        List<DictionaryTypeInfo> list = dao.getCustomerType();
        return list;
    }
    @Transactional
    public List<DictionaryTypeInfo> getCustomerOpenBank() {
        List<DictionaryTypeInfo> customerOpenBank = dao.getCustomerOpenBank();
        return customerOpenBank;
    }
    @Transactional
    public List<DictionaryTypeInfo> getCustomerSource() {
        List<DictionaryTypeInfo> customerSource = dao.getCustomerSource();
        return customerSource;
    }
    @Transactional
    public boolean findCustomerName(String customerName) {
        return dao.getChongfu(customerName);

    }
    @Transactional
    public void saveCustomerInfo(Customerinfo customerInfo) {
        Boolean a = dao.add(customerInfo);
        if(a==true){
            System.out.println("添加成功");
        }else
            System.out.println("添加失败");
    }

}
