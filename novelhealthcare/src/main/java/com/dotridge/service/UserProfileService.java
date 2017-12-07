package com.dotridge.service;

import org.springframework.stereotype.Repository;

import com.dotridge.bean.ManageUserProfileBean;
import com.dotridge.domain.UserProfile;

public interface UserProfileService {
	public ManageUserProfileBean mapDomainToBean(UserProfile userProfileDomain);

	public UserProfile mapBeanToDomain(ManageUserProfileBean manageUserProfileBean);

	public ManageUserProfileBean createuserProfile(ManageUserProfileBean userProfile);

}
