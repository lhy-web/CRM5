package com.dao;

import com.domain.MenuInfo;

import java.util.List;

public interface MenuInfoDAO {

	public abstract List findByProperty(String propertyName, Object value);


	public abstract List findAll();



}