package com.action;

import com.domain.DictionaryType;
import com.opensymphony.xwork2.ActionSupport;
import com.service.DictionaryTypeService;
import com.service.DictionaryTypeServiceImpl;

import java.util.concurrent.Executor;

public class UpdateDictionaryTypeAction extends ActionSupport {
    private DictionaryTypeService service;
    private Integer nameid;
    private String newname;

    public DictionaryTypeService getService() {
        return service;
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
        DictionaryType dictionaryType = new DictionaryType();
        dictionaryType.setDataTypeId(nameid);
        dictionaryType.setDataTypeName(newname);
        service.update(dictionaryType);
        return this.SUCCESS;
    }
}
