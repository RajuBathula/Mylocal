package com.dotridge.bean;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class LoginBean implements Serializable {
	private static final long serialVersionUID = 1741168369465614991L;
	
	@NotEmpty(message="UserId can not be Empty")
	@Size(min=4,max=20)
	private String userId;
	@NotEmpty(message="password can not be Empty")
	@Size(min=4,max=20)
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginBean [userId=" + userId + ", password=" + password + "]";
	}
}
