package com.service;

import com.domain.CustomerLevel;
import com.domain.Customerinfo;
import com.domain.DictionaryTypeInfo;

import java.util.List;

public interface CustomerInfoService {
    public List<Customerinfo> findAll();
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
    //查询公司名是否重复
    boolean findCustomerName(String customerName);
    //添加客户
    void saveCustomerInfo(Customerinfo customerInfo);
    //查看客户详细信息
    Customerinfo findCustomerInfoDetail(Integer customerInfoId);
    //修改客户信息
    Boolean updateCustomerInfo(Customerinfo customerInfo);
//    删除客户信息
    Boolean deleteCustomerInfo(Integer customerInfoId);
//根据客户姓名模糊查询
    List<Customerinfo> findByCustomerName(String type);
//根据客户地址模糊查询
    List<Customerinfo> findBycustomerAddress(String type);
//根据客户省份模糊查询
    List<Customerinfo> findBycustomerProvinces(String type);
    //根据客户城市模糊查询
    List<Customerinfo> findBycustomerCity(String type);
    //根据邮编模糊查询
    List<Customerinfo> findBycustomerCode(String type);
    //根据公司账户模糊查询
    List<Customerinfo> findBybankAccount(String type);
    //根据公司网址模糊查询
    List<Customerinfo> findBycustomerCompanyWebsize(String type);
    //根据公司电话模糊查询
    List<Customerinfo> findBycustomerCompanyPhone(String type);
    //根据备注模糊查询
    List<Customerinfo> findBynoteInformation(String type);
}
