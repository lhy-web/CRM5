package com.service;

import com.domain.MenuInfo;

import java.util.List;

public interface MenuInfoService {

	/**
	 * 查找所有菜单
	 *
	 */
	public  List<MenuInfo> findAllMenuInfo();
	
}
