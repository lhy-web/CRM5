package com.domain;

import java.util.Date;

/**
 * ComplainInfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class ComplainInfo implements java.io.Serializable {

	// Fields

	private Integer complainId;
	private String userName;
	private String customerName;
	private String complainPerson;
	private String complainTheme;
	private String complainContent;
	private Date complainDate;
	private String complainHandleWay;
	private String complainStatus;
	private String complainRemarkInfo;
	private String customerSatisfaction;

	// Constructors

	/** default constructor */
	public ComplainInfo() {
	}

	public ComplainInfo(Integer complainId, String userName, String customerName, String customerSatisfaction, String complainStatus, String complainPerson, String complainTheme, String complainContent, Date complainDate, String complainHandleWay, String complainRemarkInfo) {
		this.complainId = complainId;
		this.userName = userName;
		this.customerName = customerName;
		this.customerSatisfaction = customerSatisfaction;
		this.complainStatus = complainStatus;
		this.complainPerson = complainPerson;
		this.complainTheme = complainTheme;
		this.complainContent = complainContent;
		this.complainDate = complainDate;
		this.complainHandleWay = complainHandleWay;
		this.complainRemarkInfo = complainRemarkInfo;
	}
// Property accessors


	public Integer getComplainId() {
		return complainId;
	}

	public void setComplainId(Integer complainId) {
		this.complainId = complainId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerSatisfaction() {
		return customerSatisfaction;
	}

	public void setCustomerSatisfaction(String customerSatisfaction) {
		this.customerSatisfaction = customerSatisfaction;
	}

	public String getComplainStatus() {
		return complainStatus;
	}

	public void setComplainStatus(String complainStatus) {
		this.complainStatus = complainStatus;
	}

	public String getComplainPerson() {
		return complainPerson;
	}

	public void setComplainPerson(String complainPerson) {
		this.complainPerson = complainPerson;
	}

	public String getComplainTheme() {
		return complainTheme;
	}

	public void setComplainTheme(String complainTheme) {
		this.complainTheme = complainTheme;
	}

	public String getComplainContent() {
		return complainContent;
	}

	public void setComplainContent(String complainContent) {
		this.complainContent = complainContent;
	}

	public Date getComplainDate() {
		return complainDate;
	}

	public void setComplainDate(Date complainDate) {
		this.complainDate = complainDate;
	}

	public String getComplainHandleWay() {
		return complainHandleWay;
	}

	public void setComplainHandleWay(String complainHandleWay) {
		this.complainHandleWay = complainHandleWay;
	}

	public String getComplainRemarkInfo() {
		return complainRemarkInfo;
	}

	public void setComplainRemarkInfo(String complainRemarkInfo) {
		this.complainRemarkInfo = complainRemarkInfo;
	}

	@Override
	public String toString() {
		return "ComplainInfo{" +
				"complainId=" + complainId +
				", userName='" + userName + '\'' +
				", customerName='" + customerName + '\'' +
				", customerSatisfaction='" + customerSatisfaction + '\'' +
				", complainStatus='" + complainStatus + '\'' +
				", complainPerson='" + complainPerson + '\'' +
				", complainTheme='" + complainTheme + '\'' +
				", complainContent='" + complainContent + '\'' +
				", complainDate=" + complainDate +
				", complainHandleWay='" + complainHandleWay + '\'' +
				", complainRemarkInfo='" + complainRemarkInfo + '\'' +
				'}';
	}
}