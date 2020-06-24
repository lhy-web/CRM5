package com.action;

import com.domain.Customerinfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CustomerInfoService;
import com.utils.PageBean;

import java.util.List;
/*
* 查询全部信息的Action
* */
public class FindAllCustomerInfoAction extends ActionSupport {
    private CustomerInfoService service;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CustomerInfoService getService() {
        return service;
    }

    public void setService(CustomerInfoService service) {
        this.service = service;
    }


    public String findAll() throws Exception {
        System.out.println(type);
        List<Customerinfo> all = service.findAll();
        ActionContext.getContext().put("list",all);
        return "findAll";
    }
}
