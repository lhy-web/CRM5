package com.dao;

import java.util.List;

import com.domain.RoleInfo;
import com.page.Page;

public interface RoleInfoDAO {


	public abstract void save(RoleInfo transientInstance);

	public abstract void delete(RoleInfo persistentInstance);

	public abstract RoleInfo findById(Integer id);



	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByRoleName(Object roleName);


	public abstract List findAll(Page page);

	public abstract int findAllCount();

}