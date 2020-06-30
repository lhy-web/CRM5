package com.domain;



import java.util.HashSet;
import java.util.Set;

public class DictionaryType {
    private Integer dataTypeId;
    private String dataTypeName;

    public DictionaryType(Integer dataTypeId) {
        this.dataTypeId = dataTypeId;
    }

    public Set<DictionaryTypeInfo> getDictionaryTypeInfos() {
        return dictionaryTypeInfos;
    }

    public void setDictionaryTypeInfos(Set<DictionaryTypeInfo> dictionaryTypeInfos) {
        this.dictionaryTypeInfos = dictionaryTypeInfos;
    }

    private Set<DictionaryTypeInfo> dictionaryTypeInfos;

    public DictionaryType() {
    }

    public DictionaryType(Integer dataTypeId, String dataTypeName) {
        this.dataTypeId = dataTypeId;
        this.dataTypeName = dataTypeName;
    }



    public Integer getDataTypeId() {
        return dataTypeId;
    }

    public void setDataTypeId(Integer dataTypeId) {
        this.dataTypeId = dataTypeId;
    }

    public String getDataTypeName() {
        return dataTypeName;
    }

    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }
}
