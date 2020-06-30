package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.DictionaryTypeService;
import com.service.DictionaryTypeServiceImpl;

public class DeleteDictionaryTypeAction extends ActionSupport {

    private DictionaryTypeService service;
    private Integer id;
    @Override
    public String execute() throws Exception {
        service.delete(id);
        return this.SUCCESS;
    }

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


}
