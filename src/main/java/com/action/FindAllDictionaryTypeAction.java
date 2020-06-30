package com.action;


import com.domain.DictionaryType;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.DictionaryTypeService;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class FindAllDictionaryTypeAction extends ActionSupport {
    private DictionaryTypeService service;

    public DictionaryTypeService getService() {
        return service;
    }

    public void setService(DictionaryTypeService service) {
        this.service = service;
    }



    @Override
    public String execute() throws Exception {
        //前台传入的条件不为空时封装查询对象
        List<DictionaryType> all = service.findAll();
        HttpServletRequest request= ServletActionContext.getRequest();
        request.setAttribute("list", all);

        return "success";

    }
}
