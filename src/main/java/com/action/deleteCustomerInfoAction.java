package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.CustomerInfoService;
import com.sun.org.apache.xpath.internal.operations.Bool;

/*
* 删除客户信息的Action
* */
public class deleteCustomerInfoAction extends ActionSupport {
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
        Boolean b=service.deleteCustomerInfo(CustomerInfoId);
        if(b==true){
            return "delete";
        }else
            return "false";
    }
}
