package com.action;

import com.domain.CustomerLevel;
import com.domain.DictionaryTypeInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CustomerInfoService;
import com.service.CustomerInfoServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
/*
* 获得数据字典数据的信息*/
public class GetDirctionaryTypeInfoAction extends ActionSupport {
    private CustomerInfoService service;


    public void setService(CustomerInfoService service) {
        this.service = service;
    }

    public String getDirctionary() throws Exception {

        //获取等级
        List<CustomerLevel> c= service.getCustomerLevel();
        //获取客户开户银行
        List<DictionaryTypeInfo> customerOpenBank = service.getCustomerOpenBank();
        //获得客户性质
        List<DictionaryTypeInfo> customerProperties = service.getCustomerProperties();
        //获得客户来源
        List<DictionaryTypeInfo> customerSource = service.getCustomerSource();
        //获得客户类型
        List<DictionaryTypeInfo> customerType = service.getCustomerType();

        ActionContext.getContext().put("level",c);
        ActionContext.getContext().put("bank",customerOpenBank);
        ActionContext.getContext().put("pro",customerProperties);
        ActionContext.getContext().put("source",customerSource);
        ActionContext.getContext().put("type",customerType);
        return "getDirctionary";

    }
}
