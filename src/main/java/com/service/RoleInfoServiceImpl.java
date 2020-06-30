package com.service;

import java.util.List;

import com.dao.RoleInfoDAO;
import com.domain.RoleInfo;
import com.page.Page;
import com.page.PageUtil;
import com.page.Result;

@SuppressWarnings("unchecked")
public class RoleInfoServiceImpl implements RoleInfoService {

	private RoleInfoDAO roleInfoDAO;
	public RoleInfoDAO getRoleInfoDAO() {
		return roleInfoDAO;
	}
	public void setRoleInfoDAO(RoleInfoDAO roleInfoDAO) {
		this.roleInfoDAO = roleInfoDAO;
	}

	public void saveRole(RoleInfo roleInfo) {
		roleInfoDAO.save(roleInfo);
	}
	
	public List<RoleInfo> findByRoleName(String roleName) {
		return roleInfoDAO.findByRoleName(roleName);
	}

	public Result findAllRole(Page page) {
		page=PageUtil.createPage(page, roleInfoDAO.findAllCount());
		Result result=new Result();
		result.setPage(page);
		result.setList(roleInfoDAO.findAll(page));
		return result;
	}
	public RoleInfo findByRoleInfoId(Integer roleInfoId) {
		return roleInfoDAO.findById(roleInfoId);
	}

	public void deleteRoleInfo(RoleInfo roleInfo) {
		roleInfoDAO.delete(roleInfo);	
	}

}
