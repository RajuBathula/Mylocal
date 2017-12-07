package com.dotridge.dao;

import java.util.List;

import com.dotridge.domain.Role;

public interface RoleDao {
public Role createRole(Role role);
public List<Role> getAllRoles();
public Role getRoleByName(String name);
}
