package com.domain;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;

public class DictionaryTypeInfo  implements Serializable {
    private Integer dataId;
    private DictionaryType dictionaryType;
    private String dataInformationName;


    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public DictionaryType getDictionaryType() {
        return dictionaryType;
    }

    public void setDictionaryType(DictionaryType dictionaryType) {
        this.dictionaryType = dictionaryType;
    }

    public String getDataInformationName() {
        return dataInformationName;
    }

    public void setDataInformationName(String dataInformationName) {
        this.dataInformationName = dataInformationName;
    }

    public DictionaryTypeInfo() {
    }

    public DictionaryTypeInfo(Integer dataId, DictionaryType dictionaryType, String dataInformationName) {
        this.dataId = dataId;
        this.dictionaryType = dictionaryType;
        this.dataInformationName = dataInformationName;

    }


}
