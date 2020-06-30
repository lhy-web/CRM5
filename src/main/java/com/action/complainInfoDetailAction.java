package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.domain.ComplainInfo;
import com.service.ComplainInfoService;
import org.apache.struts2.ServletActionContext;


import com.opensymphony.xwork2.ActionSupport;

public class complainInfoDetailAction extends ActionSupport{

	private ComplainInfoService complainInfoService;

	public ComplainInfoService getComplainInfoService() {
		return complainInfoService;
	}

	public void setComplainInfoService(ComplainInfoService complainInfoService) {
		this.complainInfoService = complainInfoService;
	}
	private Integer complainId;

	public Integer getComplainId() {
		return complainId;
	}

	public void setComplainId(Integer complainId) {
		this.complainId = complainId;
	}

	@Override
	public String execute() throws Exception {
		ComplainInfo complain = complainInfoService.findComplainId(this.complainId);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("complainInfo", complain);
		return this.SUCCESS;
	}
	
	


}
