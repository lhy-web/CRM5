package com.service;

import java.util.List;

import com.domain.ComplainInfo;
import com.page.Page;
import com.page.Result;

//客户投诉
public interface ComplainInfoService {

	/**
	 * 添加客户投诉信息
	 */
	 public void saveComplainInfo(ComplainInfo complainInfo);

	 /**
	  * 查找所有的用户投诉信息,分页
	  ***/
	public Result findAllComplainInfo(Page page);

	/***
	 * 查找客户投诉complainId
	 ***/
	public ComplainInfo findComplainId(Integer complainId);
	/***
	 * 更新客户投诉信息
	 ***/
	public void updateComplainInfo(ComplainInfo complainInfo);

	/***
	 * 删除客户投诉信息
	 ***/
	public void deleteComplainInfo(Integer complainId);

	public Result findComplainInfo(Page page, String type, String key);
}
