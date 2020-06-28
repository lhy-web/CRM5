package com.action;

import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

import java.util.List;

public class UserInfoAction extends ActionSupport {

    private UserService service;

    public void setService(UserService service) {
        this.service = service;
    }

    @Override
    public String execute() throws Exception {
        List<User> list = service.findAllUser();
        ActionContext.getContext().put("list",list);
        return "findAll";
    }
}
