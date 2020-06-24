package com.action;

import com.domain.Customerinfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CustomerInfoService;

/*
* 查看客户详细信息的Action
* */
public class ViewDetailsCustomerInfoAction extends ActionSupport {
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
       Customerinfo customerinfo= service.findCustomerInfoDetail(CustomerInfoId);
        ActionContext.getContext().put("customerInfo",customerinfo);
        return "viewDetails";
    }
}
