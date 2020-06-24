package com.service;

import com.dao.CustomerInfoDao;
import com.domain.CustomerLevel;
import com.domain.Customerinfo;
import com.domain.DictionaryTypeInfo;
import com.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;
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
    public PageBean getPageBean(DetachedCriteria dc, Integer currentPage, Integer pageSize) {
        //根据查询条件获取总记录数
        Integer totalCount=dao.getTotalCount(dc);
        //创建pageBean对象
        PageBean pageBean=new PageBean(currentPage,totalCount,pageSize);
        //获取每页列表
        List<Customerinfo> list=dao.getList(dc,pageBean.getFirst(),pageBean.getPageSize());
        pageBean.setList(list);


        return pageBean;
    }

}
