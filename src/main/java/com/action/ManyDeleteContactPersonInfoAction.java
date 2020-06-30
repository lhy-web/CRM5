package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.ContactPersonInfoService;

import java.util.List;

/*
* 批量删除客户信息*/
public class ManyDeleteContactPersonInfoAction extends ActionSupport {
        private List<Integer> checkboxDelete;
        private ContactPersonInfoService service;

    public void setService(ContactPersonInfoService service) {
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
        for (Integer integer : checkboxDelete) {
            service.deleteContactPersonInfo(integer);
        }
        return "manyDeletePerson";
    }
}
