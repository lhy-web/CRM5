package com.action;

import com.domain.DictionaryTypeInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.DictionaryTypeService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class FindDictionaryTypeAction extends ActionSupport {

    private DictionaryTypeService service;

    private Integer id;

    public DictionaryTypeService getService() {
        return service;
    }

    public void setService(DictionaryTypeService service) {
        this.service = service;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(id);
        List<DictionaryTypeInfo> dictionaryTypeInfos = service.selectDictionaryTypeInfo(id);
        HttpServletRequest request= ServletActionContext.getRequest();
        request.setAttribute("list", dictionaryTypeInfos);
        return this.SUCCESS;
    }
}
