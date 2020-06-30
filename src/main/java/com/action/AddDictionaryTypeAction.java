package com.action;

import com.domain.DictionaryType;
import com.opensymphony.xwork2.ActionSupport;
import com.service.DictionaryTypeService;

public class AddDictionaryTypeAction extends ActionSupport {
    private DictionaryTypeService service;

    private DictionaryType dictionaryType;

    public DictionaryTypeService getService() {
        return service;
    }

    public void setService(DictionaryTypeService service) {
        this.service = service;
    }

    public DictionaryType getDictionaryType() {
        return dictionaryType;
    }

    public void setDictionaryType(DictionaryType dictionaryType) {
        this.dictionaryType = dictionaryType;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(dictionaryType);
        service.saveDictionaryType(dictionaryType);
        return this.SUCCESS;
    }
}
