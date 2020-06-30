package com.dao;

import java.util.List;

import com.domain.ComplainInfo;

import com.page.Page;

public interface ComplainInfoDAO {

	public abstract void save(ComplainInfo transientInstance);

	public abstract void delete(ComplainInfo persistentInstance);

	public abstract ComplainInfo findById(Integer id);

	public abstract List findCustomerName(Page page, String key);

	public abstract List findCustomerName(String key);

	public abstract List findAll();

	public abstract void attachDirty(ComplainInfo instance);

	public abstract List findAll(Page page);

	public abstract int findAllCount();

}