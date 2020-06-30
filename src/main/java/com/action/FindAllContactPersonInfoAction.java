package com.action;


import com.domain.ContactPersonInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ContactPersonInfoService;
import org.apache.struts2.interceptor.ServletRequestAware;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class FindAllContactPersonInfoAction extends ActionSupport implements ServletRequestAware {
    private ContactPersonInfoService service;
    private HttpServletRequest request;



    public ContactPersonInfoService getService() {
        return service;
    }

    public void setService(ContactPersonInfoService service) {
        this.service = service;
    }

    public String findAll() throws Exception {


        String name = request.getParameter("name");
        List<ContactPersonInfo> all = service.findAll(name);
        ActionContext.getContext().put("list", all);
        ActionContext.getContext().put("name", name);
        return "findAll";
    }


    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
}
