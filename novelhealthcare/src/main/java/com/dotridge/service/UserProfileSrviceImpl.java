package com.dotridge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotridge.bean.ManageUserProfileBean;
import com.dotridge.dao.RoleDao;
import com.dotridge.dao.UserProfileDao;
import com.dotridge.domain.Role;
import com.dotridge.domain.UserProfile;
import com.dotridge.util.CustomPasswordEncoder;

@Service
public class UserProfileSrviceImpl implements UserProfileService {
	@Autowired
	UserProfileDao userprofile;
	@Autowired
	RoleService roleService;
	@Autowired
	RoleDao roleDao;

	@Override
	public ManageUserProfileBean mapDomainToBean(UserProfile userProfileDomain) {

		ManageUserProfileBean bean = new ManageUserProfileBean();

		bean.setFirstName(userProfileDomain.getFirstName());
		bean.setLastName(userProfileDomain.getLastName());
		bean.setEmail(userProfileDomain.getEmail());
		bean.setUserName(userProfileDomain.getUserId());
		bean.setPassword(userProfileDomain.getPassword());
		bean.setConfirmPassword(userProfileDomain.getConfirmPassword());
		bean.setPhoneNum(userProfileDomain.getPhoneNum());

		Role role = userProfileDomain.getRole();
		String roleName = role.getRoleName();
		bean.setRoleName(roleName);

		return bean;
	}

	@Override
	public UserProfile mapBeanToDomain(ManageUserProfileBean manageUserProfileBean) {
		UserProfile profile=new UserProfile();
		profile.setFirstName(manageUserProfileBean.getFirstName());
		profile.setLastName(manageUserProfileBean.getLastName());
		profile.setEmail(manageUserProfileBean.getEmail());
		profile.setPassword(CustomPasswordEncoder.encodePassword(manageUserProfileBean.getPassword()));
		profile.setConfirmPassword(CustomPasswordEncoder.encodePassword(manageUserProfileBean.getConfirmPassword()));
		profile.setUserId(manageUserProfileBean.getUserName());
		profile.setPhoneNum(manageUserProfileBean.getPhoneNum());
		
		profile.setRole(roleDao.getRoleByName(manageUserProfileBean.getRoleName()));
		
		return profile;
	}

	@Override
	public ManageUserProfileBean createuserProfile(ManageUserProfileBean userProfile) {
		UserProfile beanToDomain = mapBeanToDomain(userProfile);
		UserProfile createAdmin = userprofile.createUserProfile(beanToDomain);
		ManageUserProfileBean domainToBean = mapDomainToBean(createAdmin);
		return domainToBean;
	}

}
