package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.dao.ComplainInfoDAO;
import com.domain.ComplainInfo;
import com.page.Page;
import com.page.PageUtil;
import com.page.Result;


public class ComplainInfoServiceImpl implements ComplainInfoService{

	private ComplainInfoDAO complainInfoDAO;
	
	public ComplainInfoDAO getComplainInfoDAO() {
		return complainInfoDAO;
	}

	public void setComplainInfoDAO(ComplainInfoDAO complainInfoDAO) {
		this.complainInfoDAO = complainInfoDAO;
	}

	public void saveComplainInfo(ComplainInfo complainInfo) {
		complainInfoDAO.save(complainInfo);
	}

	public Result findAllComplainInfo(Page page) {
		page= PageUtil.createPage(page, complainInfoDAO.findAllCount());

		Result result=new Result();
		result.setList(complainInfoDAO.findAll(page));
		result.setPage(page);
		return result;
	}

	public ComplainInfo findComplainId(Integer complainId) {
		if (complainId==null){
			return null;
		}else {
			return complainInfoDAO.findById(complainId);
		}
	}

	public void updateComplainInfo(ComplainInfo complainInfo) {
		complainInfoDAO.attachDirty(complainInfo);
	}

	public void deleteComplainInfo(Integer complainId) {
		complainInfoDAO.delete(complainInfoDAO.findById(complainId));
	}

	public Result findComplainInfo(Page page,String type,String key) {
		List complainInfos = null;
		if (key == null || key.equals("")){
			page= PageUtil.createPage(page,complainInfoDAO.findAllCount());
			complainInfos = complainInfoDAO.findAll(page);
		} else{
			if (type.equals("complainId")) {
				if (key.matches("^[0-9]*$")){
					page= PageUtil.createPage(page,1);
					ComplainInfo byId = complainInfoDAO.findById(Integer.parseInt(key));
					complainInfos = new ArrayList<ComplainInfo>();
					complainInfos.add(byId);
				}
			} else if (type.equals("customerName")) {
				page= PageUtil.createPage(page,complainInfoDAO.findCustomerName(key).size());
				complainInfos = complainInfoDAO.findCustomerName(page,key);
			}
		}
		Result result = new Result();
		result.setList(complainInfos);
		result.setPage(page);
		return result;
	}

}
