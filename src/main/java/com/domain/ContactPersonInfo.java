package com.domain;

import java.io.Serializable;
import java.util.Date;


public class ContactPersonInfo implements Serializable {

    private Integer contactId;
    private Integer customerId;
    private String contactName;
    private String contactSex;
    private Date contactBirthday;
    private String contactPost;
    private String contactOfficePhone;
    private String contactMobilePhone;
    private String contactEmail;
    private Date contactRegistDate;
    private String contactQQnumber;
    private String contactRemarks;

    public ContactPersonInfo() {
    }

    public ContactPersonInfo(Integer customerId, String contactName,
                             String contactSex, Date contactBirthday, String contactPost,
                             String contactOfficePhone, String contactMobilePhone,
                             String contactEmail, Date contactRegistDate,
                             String contactQQnumber, String contactRemarks) {
        this.customerId = customerId;
        this.contactName = contactName;
        this.contactSex = contactSex;
        this.contactBirthday = contactBirthday;
        this.contactPost = contactPost;
        this.contactOfficePhone = contactOfficePhone;
        this.contactMobilePhone = contactMobilePhone;
        this.contactEmail = contactEmail;
        this.contactRegistDate = contactRegistDate;
        this.contactQQnumber = contactQQnumber;
        this.contactRemarks = contactRemarks;
    }


    public Integer getContactId() {
        return this.contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactSex() {
        return this.contactSex;
    }

    public void setContactSex(String contactSex) {
        this.contactSex = contactSex;
    }

    public Date getContactBirthday() {
        return this.contactBirthday;
    }

    public void setContactBirthday(Date contactBirthday) {
        this.contactBirthday = contactBirthday;
    }

    public String getContactPost() {
        return this.contactPost;
    }

    public void setContactPost(String contactPost) {
        this.contactPost = contactPost;
    }

    public String getContactOfficePhone() {
        return this.contactOfficePhone;
    }

    public void setContactOfficePhone(String contactOfficePhone) {
        this.contactOfficePhone = contactOfficePhone;
    }

    public String getContactMobilePhone() {
        return this.contactMobilePhone;
    }

    public void setContactMobilePhone(String contactMobilePhone) {
        this.contactMobilePhone = contactMobilePhone;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Date getContactRegistDate() {
        return this.contactRegistDate;
    }

    public void setContactRegistDate(Date contactRegistDate) {
        this.contactRegistDate = contactRegistDate;
    }

    public String getContactQQnumber() {
        return this.contactQQnumber;
    }

    public void setContactQQnumber(String contactQQnumber) {
        this.contactQQnumber = contactQQnumber;
    }

    public String getContactRemarks() {
        return this.contactRemarks;
    }

    public void setContactRemarks(String contactRemarks) {
        this.contactRemarks = contactRemarks;
    }

}