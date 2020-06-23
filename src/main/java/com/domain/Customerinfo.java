package com.domain;


import java.io.Serializable;

public class Customerinfo implements Serializable {
    private Integer customerId;//客户id
    private String  customerName;//客户名称
    private String  customerCompanyWebsize;//客户公司网址
    private String  customerCompanyPhone;//客户公司电话
    private String register;//登记人
    private String customerAddress;//客户地址
    private String customerProvinces;//客户所属省份
    private String customerCity;//客户所属城市
    private String customerCode;//客户公司邮编
    private String bankAccount;//银行账号
    private String noteInformation;//备注信息
    private CustomerLevel customerLevel;//客户等级
    private DictionaryTypeInfo dictionaryTypeInfoByOpenBank;//客户开户银行
    private DictionaryTypeInfo dictionaryTypeInfoByCustomerType;//客户类型
    private DictionaryTypeInfo dictionaryTypeInfoByCustomerSource;//客户来源

    public Customerinfo() {
    }

    private DictionaryTypeInfo dictionaryTypeInfoByCustomerProperties;//客户性质

    public Customerinfo(Integer customerId, String customerName, String customerCompanyWebsize, String customerCompanyPhone, String register, String customerAddress, String customerProvinces, String customerCity, String customerCode, String bankAccount, String noteInformation, CustomerLevel customerLevel, DictionaryTypeInfo dictionaryTypeInfoByOpenBank, DictionaryTypeInfo dictionaryTypeInfoByCustomerType, DictionaryTypeInfo dictionaryTypeInfoByCustomerSource, DictionaryTypeInfo dictionaryTypeInfoByCustomerProperties) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerCompanyWebsize = customerCompanyWebsize;
        this.customerCompanyPhone = customerCompanyPhone;
        this.register = register;
        this.customerAddress = customerAddress;
        this.customerProvinces = customerProvinces;
        this.customerCity = customerCity;
        this.customerCode = customerCode;
        this.bankAccount = bankAccount;
        this.noteInformation = noteInformation;
        this.customerLevel = customerLevel;
        this.dictionaryTypeInfoByOpenBank = dictionaryTypeInfoByOpenBank;
        this.dictionaryTypeInfoByCustomerType = dictionaryTypeInfoByCustomerType;
        this.dictionaryTypeInfoByCustomerSource = dictionaryTypeInfoByCustomerSource;
        this.dictionaryTypeInfoByCustomerProperties = dictionaryTypeInfoByCustomerProperties;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCompanyWebsize() {
        return customerCompanyWebsize;
    }

    public void setCustomerCompanyWebsize(String customerCompanyWebsize) {
        this.customerCompanyWebsize = customerCompanyWebsize;
    }

    public String getCustomerCompanyPhone() {
        return customerCompanyPhone;
    }

    public void setCustomerCompanyPhone(String customerCompanyPhone) {
        this.customerCompanyPhone = customerCompanyPhone;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerProvinces() {
        return customerProvinces;
    }

    public void setCustomerProvinces(String customerProvinces) {
        this.customerProvinces = customerProvinces;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getNoteInformation() {
        return noteInformation;
    }

    public void setNoteInformation(String noteInformation) {
        this.noteInformation = noteInformation;
    }

    public CustomerLevel getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(CustomerLevel customerLevel) {
        this.customerLevel = customerLevel;
    }

    public DictionaryTypeInfo getDictionaryTypeInfoByOpenBank() {
        return dictionaryTypeInfoByOpenBank;
    }

    public void setDictionaryTypeInfoByOpenBank(DictionaryTypeInfo dictionaryTypeInfoByOpenBank) {
        this.dictionaryTypeInfoByOpenBank = dictionaryTypeInfoByOpenBank;
    }

    public DictionaryTypeInfo getDictionaryTypeInfoByCustomerType() {
        return dictionaryTypeInfoByCustomerType;
    }

    public void setDictionaryTypeInfoByCustomerType(DictionaryTypeInfo dictionaryTypeInfoByCustomerType) {
        this.dictionaryTypeInfoByCustomerType = dictionaryTypeInfoByCustomerType;
    }

    public DictionaryTypeInfo getDictionaryTypeInfoByCustomerSource() {
        return dictionaryTypeInfoByCustomerSource;
    }

    public void setDictionaryTypeInfoByCustomerSource(DictionaryTypeInfo dictionaryTypeInfoByCustomerSource) {
        this.dictionaryTypeInfoByCustomerSource = dictionaryTypeInfoByCustomerSource;
    }

    public DictionaryTypeInfo getDictionaryTypeInfoByCustomerProperties() {
        return dictionaryTypeInfoByCustomerProperties;
    }

    public void setDictionaryTypeInfoByCustomerProperties(DictionaryTypeInfo dictionaryTypeInfoByCustomerProperties) {
        this.dictionaryTypeInfoByCustomerProperties = dictionaryTypeInfoByCustomerProperties;
    }
}
