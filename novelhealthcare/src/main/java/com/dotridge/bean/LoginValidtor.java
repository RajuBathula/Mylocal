package com.dotridge.bean;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Component
public class LoginValidtor implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		boolean flag = false;
		if (clazz.equals(LoginBean.class)) {
			flag = true;
		}
		return flag;
	}

	@Override
	public void validate(Object target, Errors errors) {
		LoginBean bean = (LoginBean) target;
		String userId = bean.getUserId();
		//errors.rejectValue("userId", "field.reqired.loginBean.userId",new Object[]{bean.getUserId()}, "userName Required");
	   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "field.reqired.loginBean.userId", new Object[]{bean.getUserId()}, "userName Required");
	   if(userId!=null && userId.length()<4){
	   errors.rejectValue("userId", "field.minLength.loginBean.userId", new Object[]{bean.getUserId()}, "UserId should be a minimum of 4 characters defualt");
	   }
	   else{
		   errors.rejectValue("userId", "field.maxLength.loginBean.userId", new Object[]{bean.getUserId()}, "UserId should be a maximum of 8 characters defualt");
	   }
	   
	}

}
