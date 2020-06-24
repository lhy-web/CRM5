package com.action;

import com.domain.CustomerLevel;
import com.domain.Customerinfo;
import com.domain.DictionaryTypeInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CustomerInfoService;

import java.util.List;

/*
* 修改客户信息(回显)
* */
public class CustomerInfoUpdateAction extends ActionSupport {
    private Integer CustomerInfoId;
    private CustomerInfoService service;

    public Integer getCustomerInfoId() {
        return CustomerInfoId;
    }

    public void setCustomerInfoId(Integer customerInfoId) {
        CustomerInfoId = customerInfoId;
    }

    public CustomerInfoService getService() {
        return service;
    }

    public void setService(CustomerInfoService service) {
        this.service = service;
    }

    @Override
    public String execute() throws Exception {
        Customerinfo customerInfoDetail = service.findCustomerInfoDetail(CustomerInfoId);
        ActionContext.getContext().put("customerInfo",customerInfoDetail);
        List<DictionaryTypeInfo> customerType = service.getCustomerType();
        List<DictionaryTypeInfo> customerSource = service.getCustomerSource();
        List<DictionaryTypeInfo> customerProperties = service.getCustomerProperties();
        List<DictionaryTypeInfo> customerOpenBank = service.getCustomerOpenBank();
        List<CustomerLevel> customerLevel = service.getCustomerLevel();
        ActionContext.getContext().put("customerType",customerType);
        ActionContext.getContext().put("customerSource",customerSource);
        ActionContext.getContext().put("customerProperties",customerProperties);
        ActionContext.getContext().put("customerOpenBank",customerOpenBank);
        ActionContext.getContext().put("customerLevel",customerLevel);

        return "update";
    }
}
