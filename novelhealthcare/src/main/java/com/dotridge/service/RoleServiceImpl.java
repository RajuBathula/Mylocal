package com.dotridge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotridge.bean.RoleBean;
import com.dotridge.dao.RoleDao;
import com.dotridge.domain.Role;
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleDao roleDao;

	@Override
	public RoleBean mapDomainToBean(Role roleDomain) {
		RoleBean roleBean = new RoleBean();
		roleBean.setRoleId(roleDomain.getRoleId());
		roleBean.setRoleName(roleDomain.getRoleName());
		return roleBean;
	}

	@Override
	public Role mapBeanToDomain(RoleBean roleBean) {
		Role role = new Role();
		role.setRoleName(roleBean.getRoleName());
		role.setRoleId(roleBean.getRoleId());
		return role;
	}

	@Override
	public List<RoleBean> getAllRoles() {
		List<Role> rolesList = roleDao.getAllRoles();
		List<RoleBean> uiRoleList = null;
		if (rolesList != null && !rolesList.isEmpty()) {
			uiRoleList = new ArrayList<RoleBean>();
			for (Role roledomain : rolesList) {
				RoleBean domainToBean = mapDomainToBean(roledomain);
				uiRoleList.add(domainToBean);
			}
		}

		return uiRoleList;
	}

}
