package com.action;

import com.domain.RoleInfo;
import com.domain.RoleRelationship;
import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoleInfoService;
import com.service.RoleRelationshipService;
import com.service.UserService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public class  UserLoginAction extends ActionSupport {
    private String userLoginName;
    private String userPassWord;
    private UserService service;

    public void setRoleRelationshipService(RoleRelationshipService roleRelationshipService) {
        this.roleRelationshipService = roleRelationshipService;
    }

    private RoleRelationshipService roleRelationshipService;

    public void setService(UserService service) {
        this.service = service;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    @Override
    public String execute() throws Exception {
        Boolean login = service.Login(userLoginName, userPassWord);
        if(login==true){
           List<User> name= service.getUser(userLoginName);
            User user = name.get(0);
            RoleInfo roleInfo=  service.findUserInfo(user.getRole());
            List<RoleRelationship> roleRelationship=roleRelationshipService.findByRoleRelationship(roleInfo);
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("roleRelationship", roleRelationship);
            return "LoginSuccess";
        }else {
            ActionContext.getContext().put("LoginFalse","用户名或密码错误,请重新输入");
            return "LoginFalse";}
    }
}
