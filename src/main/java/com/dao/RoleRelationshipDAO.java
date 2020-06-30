package com.dao;

import java.util.List;

import com.domain.RoleRelationship;

public interface RoleRelationshipDAO {

	public abstract void save(RoleRelationship transientInstance);

	public abstract void delete(RoleRelationship persistentInstance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract void attachDirty(RoleRelationship instance);


}