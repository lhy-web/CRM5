package com.action;

import com.domain.ContactPersonInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.service.ContactPersonInfoService;

import java.util.Date;

public class ContactPersonInfoSaveAction extends ActionSupport {


    private Integer customerId;
    private String contactName;
    private String contactSex;
    private Date contactBirthday;
    private String contactPost;
    private String contactOfficePhone;
    private String contactMobilePhone;
    private String contactEmail;
    private Date contactRegistDate;
    private String contactRemarks;
    private String contactQQNumber;
    private ContactPersonInfoService service;

    @Override
    public String execute() throws Exception {

        ContactPersonInfo contactPersonInfo=new ContactPersonInfo();

        contactPersonInfo.setCustomerId(customerId);
        contactPersonInfo.setContactName(contactName);
        contactPersonInfo.setContactSex(contactSex);
        contactPersonInfo.setContactBirthday(contactBirthday);
        contactPersonInfo.setContactPost(contactPost);
        contactPersonInfo.setContactEmail(contactEmail);
        contactPersonInfo.setContactMobilePhone(contactMobilePhone);

        contactPersonInfo.setContactOfficePhone(contactOfficePhone);
        contactPersonInfo.setContactQQnumber(contactQQNumber);
        contactPersonInfo.setContactRegistDate(contactRegistDate);
        contactPersonInfo.setContactRemarks(contactRemarks);
        if (contactName != null && !"".equals(contactName.trim())){
            service.saveContactPersonInfo(contactPersonInfo);
        }
        return "addContactPerson";
    }



    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactSex() {
        return contactSex;
    }

    public void setContactSex(String contactSex) {
        this.contactSex = contactSex;
    }

    public Date getContactBirthday() {
        return contactBirthday;
    }

    public void setContactBirthday(Date contactBirthday) {
        this.contactBirthday = contactBirthday;
    }

    public String getContactPost() {
        return contactPost;
    }

    public void setContactPost(String contactPost) {
        this.contactPost = contactPost;
    }

    public String getContactOfficePhone() {
        return contactOfficePhone;
    }

    public void setContactOfficePhone(String contactOfficePhone) {
        this.contactOfficePhone = contactOfficePhone;
    }

    public String getContactMobilePhone() {
        return contactMobilePhone;
    }

    public void setContactMobilePhone(String contactMobilePhone) {
        this.contactMobilePhone = contactMobilePhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Date getContactRegistDate() {
        return contactRegistDate;
    }

    public void setContactRegistDate(Date contactRegistDate) {
        this.contactRegistDate = contactRegistDate;
    }

    public String getContactRemarks() {
        return contactRemarks;
    }

    public void setContactRemarks(String contactRemarks) {
        this.contactRemarks = contactRemarks;
    }

    public String getContactQQNumber() {
        return contactQQNumber;
    }

    public void setContactQQNumber(String contactQQNumber) {
        this.contactQQNumber = contactQQNumber;
    }


    public ContactPersonInfoService getService() {
        return service;
    }

    public void setService(ContactPersonInfoService service) {
        this.service = service;
    }
}
