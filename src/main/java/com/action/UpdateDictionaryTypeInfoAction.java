package com.action;

import com.domain.DictionaryTypeInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.DictionaryTypeService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class UpdateDictionaryTypeInfoAction extends ActionSupport {
    private DictionaryTypeService service;
    private Integer nameid;
    private String newname;
private Integer nametype;
    public DictionaryTypeService getService() {
        return service;
    }

    public Integer getNametype() {
        return nametype;
    }

    public void setNametype(Integer nametype) {
        this.nametype = nametype;
    }

    public void setService(DictionaryTypeService service) {
        this.service = service;
    }

    public Integer getNameid() {
        return nameid;
    }

    public void setNameid(Integer nameid) {
        this.nameid = nameid;
    }

    public String getNewname() {
        return newname;
    }

    public void setNewname(String newname) {
        this.newname = newname;
    }

    @Override
    public String execute() throws Exception {

        DictionaryTypeInfo dictionaryTypeInfo = new DictionaryTypeInfo(nameid, nametype, newname);
        service.update(dictionaryTypeInfo);
        HttpServletRequest request= ServletActionContext.getRequest();
        request.setAttribute("id", nametype);

        return super.execute();
    }
}
