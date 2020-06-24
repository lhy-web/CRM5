package com.action;

import com.domain.Customerinfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CustomerInfoService;

import java.util.List;
/*
* 查询全部信息的Action
* */
public class FindAllCustomerInfoAction extends ActionSupport {
    private CustomerInfoService service;

    public CustomerInfoService getService() {
        return service;
    }

    public void setService(CustomerInfoService service) {
        this.service = service;
    }


    public String findAll() throws Exception {
        List<Customerinfo> all = service.findAll();
        ActionContext.getContext().put("list",all);
        return "findAll";
    }
}
