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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private String key;

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
        if(key!=null) {
            if (type.equals("customerName")) {
                List<Customerinfo> list = service.findByCustomerName(key);
                ActionContext.getContext().put("list",list);
                return "findAll";
            } else if (type.equals("customerAddress")) {
                List<Customerinfo> list = service.findBycustomerAddress(key);
                ActionContext.getContext().put("list",list); return "findAll";
            } else if (type.equals("customerProvinces")) {
                List<Customerinfo> list = service.findBycustomerProvinces(key);
                ActionContext.getContext().put("list",list); return "findAll";
            } else if (type.equals("customerCity")) {
                List<Customerinfo> list = service.findBycustomerCity(key);
                ActionContext.getContext().put("list",list); return "findAll";
            } else if (type.equals("customerCode")) {
                List<Customerinfo> list = service.findBycustomerCode(key);
                ActionContext.getContext().put("list",list); return "findAll";
            } else if (type.equals("bankAccount")) {
                List<Customerinfo> list = service.findBybankAccount(key);
                ActionContext.getContext().put("list",list); return "findAll";
            } else if (type.equals("customerCompanyWebsize")) {
                List<Customerinfo> list = service.findBycustomerCompanyWebsize(key);
                ActionContext.getContext().put("list",list); return "findAll";
            } else if (type.equals("customerCompanyPhone")) {
                List<Customerinfo> list = service.findBycustomerCompanyPhone(key);
                ActionContext.getContext().put("list",list); return "findAll";
            } else if (type == "noteInformation") {
                List<Customerinfo> list = service.findBynoteInformation(key);
                ActionContext.getContext().put("list",list);
                return "findAll";
            }
        }else {
        List<Customerinfo> all = service.findAll();
        ActionContext.getContext().put("list",all);}
        return "findAll";

    }
}
