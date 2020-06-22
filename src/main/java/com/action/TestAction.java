package com.action;

import com.domain.TestBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.TestService;
import com.service.TestServiceImpl;

import java.util.List;

public class TestAction extends ActionSupport {
    private TestService service;

    public void setService(TestService service) {
        this.service = service;
    }

    @Override
    public String execute() throws Exception {
        List<TestBean> list = service.getlist();
        ActionContext.getContext().put("list",list);
        return "success";
    }
}
