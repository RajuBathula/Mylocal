package com.dotridge.service;

import java.util.List;

import com.dotridge.bean.RoleBean;
import com.dotridge.domain.Role;

public interface RoleService {
	public RoleBean mapDomainToBean(Role roleDomain);

	public Role mapBeanToDomain(RoleBean roleBean);

	List<RoleBean> getAllRoles();

}
