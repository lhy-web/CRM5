package com.domain;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class RoleInfo {
    private int roleId;
    private String roleName;
//    private Collection<RoleRelationship> roleRelationships;
    private Set roleRelationships = new HashSet(0);

    public RoleInfo() {
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleRelationships=" + roleRelationships +
                '}';
    }

    public RoleInfo(String roleName, Set roleRelationships) {
        this.roleName = roleName;
        this.roleRelationships = roleRelationships;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


//    public Collection<RoleRelationship> getRoleRelationships() {
//        return roleRelationships;
//    }
//
//    public void setRoleRelationships(Collection<RoleRelationship> roleRelationships) {
//        this.roleRelationships = roleRelationships;
//    }

    public Set getRoleRelationships() {
        return this.roleRelationships;
    }

    public void setRoleRelationships(Set roleRelationships) {
        this.roleRelationships = roleRelationships;
    }
}
