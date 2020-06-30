package com.action;


import com.domain.ContactPersonInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ContactPersonInfoService;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.TreeMap;

public class UpdateContactPersonInfoAction extends ActionSupport implements ServletRequestAware {
    private ContactPersonInfoService service;
    private Integer ContactPersonInfoId;
    private HttpServletRequest request;
    private ContactPersonInfo contactPersonInfo;
    public ContactPersonInfoService getService() {
        return service;
    }

    public void setService(ContactPersonInfoService service) {
        this.service = service;
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public ContactPersonInfo getContactPersonInfo() {
        return contactPersonInfo;
    }

    public void setContactPersonInfo(ContactPersonInfo contactPersonInfo) {
        this.contactPersonInfo = contactPersonInfo;
    }

    public Integer getContactPersonInfoId() {
        return ContactPersonInfoId;
    }

    public void setContactPersonInfoId(Integer contactPersonInfoId) {
        ContactPersonInfoId = contactPersonInfoId;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String updatePerson(){
        ContactPersonInfo personInfo =  service.getOne(ContactPersonInfoId);
        Map sexMap = new TreeMap();
        sexMap.put("男", "男");
        sexMap.put("女", "女");
        ActionContext.getContext().put("sexMap",sexMap);
        ActionContext.getContext().put("contactPersonInfo",personInfo);
        return "updateContactPersonPage";
    }

    public String updateContactPerson() {
        try {
            System.out.println(contactPersonInfo);
            if (contactPersonInfo != null) {
                service.updateContactPersonInfo(contactPersonInfo);
            }
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            ActionContext.getContext().put("errMsg", "保存联系人时错误！");
            return "error";
        }
    }

}
