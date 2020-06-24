package com.action;

import com.domain.CustomerLevel;
import com.domain.Customerinfo;
import com.domain.DictionaryTypeInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CustomerInfoService;

/*修改客户信息*/
public class updateCustomerAction extends ActionSupport {
    private Integer customerId;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    private String customerName;
    private Integer customerPropertiesId;
    private Integer customerTypeId;
    private Integer levelId;
    private String customerCompanyWebsize;
    private String customerCompanyPhone;
    private String register;
    private String customerAddress;
    private String customerProvinces;
    private String customerCity;
    private String customerCode;
    private Integer openBankId;
    private String bankAccount;

    @Override
    public String execute() throws Exception {
        Customerinfo customerInfo=new Customerinfo();
        customerInfo.setCustomerId(customerId);
        customerInfo.setCustomerName(customerName);
        customerInfo.setCustomerCompanyWebsize(customerCompanyWebsize);
        customerInfo.setCustomerCompanyPhone(customerCompanyPhone);
        customerInfo.setRegister(register);
        customerInfo.setCustomerAddress(customerAddress);
        customerInfo.setCustomerProvinces(customerProvinces);
        customerInfo.setCustomerCity(customerCity);
        customerInfo.setCustomerCode(customerCode);
        customerInfo.setBankAccount(bankAccount);
        customerInfo.setNoteInformation(noteInformation);
        CustomerLevel customerLevel=new CustomerLevel();
        customerLevel.setLevelId(levelId);
        customerInfo.setCustomerLevel(customerLevel);

        DictionaryTypeInfo dictionaryTypeInfo1 = new DictionaryTypeInfo();
        dictionaryTypeInfo1.setDataId(customerPropertiesId);
        customerInfo.setDictionaryTypeInfoByCustomerProperties(dictionaryTypeInfo1);

        DictionaryTypeInfo dictionaryTypeInfo2 = new DictionaryTypeInfo();
        dictionaryTypeInfo2.setDataId(customerTypeId);
        customerInfo.setDictionaryTypeInfoByCustomerType(dictionaryTypeInfo2);

        DictionaryTypeInfo dictionaryTypeInfo3 = new DictionaryTypeInfo();
        dictionaryTypeInfo3.setDataId(openBankId);
        customerInfo.setDictionaryTypeInfoByOpenBank(dictionaryTypeInfo3);

        DictionaryTypeInfo dictionaryTypeInfo4 = new DictionaryTypeInfo();
        dictionaryTypeInfo4.setDataId(customerSourceId);
        customerInfo.setDictionaryTypeInfoByCustomerSource(dictionaryTypeInfo4);

        Boolean b=service.updateCustomerInfo(customerInfo);
        if (b==true) {
            return "updateCustomer";
        }
        else return "false";
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerPropertiesId() {
        return customerPropertiesId;
    }

    public void setCustomerPropertiesId(Integer customerPropertiesId) {
        this.customerPropertiesId = customerPropertiesId;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
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

    public Integer getOpenBankId() {
        return openBankId;
    }

    public void setOpenBankId(Integer openBankId) {
        this.openBankId = openBankId;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Integer getCustomerSourceId() {
        return customerSourceId;
    }

    public void setCustomerSourceId(Integer customerSourceId) {
        this.customerSourceId = customerSourceId;
    }

    public String getNoteInformation() {
        return noteInformation;
    }

    public void setNoteInformation(String noteInformation) {
        this.noteInformation = noteInformation;
    }

    public CustomerInfoService getService() {
        return service;
    }

    public void setService(CustomerInfoService service) {
        this.service = service;
    }

    private Integer customerSourceId;
    private String noteInformation;
    private CustomerInfoService service;
}
