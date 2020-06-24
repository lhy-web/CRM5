package com.dao;

import com.domain.CustomerLevel;
import com.domain.Customerinfo;
import com.domain.DictionaryTypeInfo;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface CustomerInfoDao {
    //查询全部
    List<Customerinfo> findAll();
    //添加客户信息
    Boolean add(Customerinfo customerinfo);
    //获取客户等级
    List<CustomerLevel> getCustomerLevel();
    //获取客户性质
    List<DictionaryTypeInfo> getCustomerProperties();
    //获取客户类型
    List<DictionaryTypeInfo> getCustomerType();
    //获取开户银行
    List<DictionaryTypeInfo> getCustomerOpenBank();
    //获取客户来源
    List<DictionaryTypeInfo> getCustomerSource();
    //查看公司名是否重复
    boolean getChongfu(String customerName);
    //查看客户详细信息
    Customerinfo findById(Integer customerInfoId);
    //修改客户信息
    Boolean updateCustomer(Customerinfo customerInfo);
//删除客户信息
    Boolean deleteCustomer(Integer customerInfoId);


    Integer getTotalCount(DetachedCriteria dc);

    List<Customerinfo> getList(DetachedCriteria dc, Integer first, Integer pageSize);
}