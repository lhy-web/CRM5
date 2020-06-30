package com.service;

import java.util.List;

import com.domain.RoleInfo;
import com.page.Page;
import com.page.Result;

public interface RoleInfoService {

	/**
	 * 保存角色
	 * **/
	public void saveRole(RoleInfo roleInfo);
	/**
	 * 查找角色名称
	 * **/
	public List<RoleInfo> findByRoleName(String roleName);
	/**
	 * 查找所有的角色,分页
	 * **/
	public Result findAllRole(Page page);
	
	/**
	 * 查找角色id获得角色
	 * **/
	public RoleInfo findByRoleInfoId(Integer roleInfoId);
	
	/**
	 * 删除角色
	 * **/
	public void deleteRoleInfo(RoleInfo roleInfo);
	

}
