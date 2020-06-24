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
    @Transactional
    public Customerinfo findCustomerInfoDetail(Integer customerInfoId) {
       return dao.findById(customerInfoId);
    }
    @Transactional
    public Boolean updateCustomerInfo(Customerinfo customerInfo) {
        return dao.updateCustomer(customerInfo);
    }
    @Transactional
    public Boolean deleteCustomerInfo(Integer customerInfoId) {
       return dao.deleteCustomer(customerInfoId);
    }
    @Transactional
    public List<Customerinfo> findByCustomerName(String type) {
        return dao.findByCustomerName(type);
    }
    @Transactional
    public List<Customerinfo> findBycustomerAddress(String type) {
        return dao.findBycustomerAddress(type);
    }
    @Transactional
    public List<Customerinfo> findBycustomerProvinces(String type) {
        return dao.findBycustomerProvinces(type);
    }
    @Transactional
    public List<Customerinfo> findBycustomerCity(String type) {
        return dao.findBycustomerCity(type);
    }
    @Transactional
    public List<Customerinfo> findBycustomerCode(String type) {
        return dao.findBycustomerCode(type);
    }
    @Transactional
    public List<Customerinfo> findBybankAccount(String type) {
        return dao.findBybankAccount(type);
    }
    @Transactional
    public List<Customerinfo> findBycustomerCompanyWebsize(String type) {
        return dao.findBycustomerCompanyWebsize(type);
    }
    @Transactional
    public List<Customerinfo> findBycustomerCompanyPhone(String type) {
        return dao.findBycustomerCompanyPhone(type);
    }
    @Transactional
    public List<Customerinfo> findBynoteInformation(String type) {
        return dao.findBynoteInformation(type);
    }

}
