package com.service;

import java.util.List;

import com.dao.MenuInfoDAO;
import com.domain.MenuInfo;
import org.springframework.transaction.annotation.Transactional;


public class MenuInfoServiceImpl implements MenuInfoService {

	private MenuInfoDAO menuInfoDAO;
	
	public MenuInfoDAO getMenuInfoDAO() {
		return menuInfoDAO;
	}

	public void setMenuInfoDAO(MenuInfoDAO menuInfoDAO) {
		this.menuInfoDAO = menuInfoDAO;
	}

	public List<MenuInfo> findAllMenuInfo() {
		return menuInfoDAO.findAll();
	}

}
