package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.CustomerInfoService;

import java.util.List;

/*
* 批量删除客户信息*/
public class ManyDeleteCustomerAction extends ActionSupport {
        private List<Integer> checkboxDelete;
        private CustomerInfoService service;

    public void setService(CustomerInfoService service) {
        this.service = service;
    }

    public List<Integer> getCheckboxDelete() {
        return checkboxDelete;
    }

    public void setCheckboxDelete(List<Integer> checkboxDelete) {
        this.checkboxDelete = checkboxDelete;
    }

    @Override
    public String execute() throws Exception {
        if(checkboxDelete!=null){
        for (Integer integer : checkboxDelete) {
            service.deleteCustomerInfo(integer);
        }}
        return "manyDelete";
    }
}
