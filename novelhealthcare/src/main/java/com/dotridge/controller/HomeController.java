/**
 * 
 */
package com.dotridge.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dotridge.bean.LoginBean;
import com.dotridge.bean.LoginValidtor;
import com.dotridge.bean.ManageUserProfileBean;
import com.dotridge.bean.RoleBean;
import com.dotridge.service.RoleService;
import com.dotridge.service.UserProfileService;
import com.dotridge.util.ServiceConstraints;

/**
 * @author Raju
 *
 */
@Controller
public class HomeController {

	@Autowired
	private LoginValidtor loginvalidator;
	@Autowired
	private UserProfileService userProfileservice;
	@Autowired
	private RoleService roleService;

	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) {
	 * binder.setValidator(loginvalidator); }
	 */
	@RequestMapping(value = "/home")
	public String getHomePage() {
		return "home";

	}

	@RequestMapping(value = "/getLoginPage")
	public String getLoginPage(Model model) {
		model.addAttribute("loginBean", new LoginBean());
		return "login";

	}

	@RequestMapping(value = "/login")
	public String doLogin(@Valid @ModelAttribute("loginBean") LoginBean loginBean, BindingResult result) {
		if (result.hasErrors()) {
			List<FieldError> fieldErrors = result.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {
				System.out.println(fieldError);

			}
			return "login";
		}
		System.out.println(loginBean.toString());
		String userName = loginBean.getUserId();
		if (userName != null && !userName.isEmpty()) {
			if (userName.equalsIgnoreCase("superadmin@email.com"))
				;
			return "getSuperAdminBoard";
		}

		return "home";

	}

	@RequestMapping("/windowlogin")
	public String windowLogin(HttpServletRequest request) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String userName = authentication.getName();
		System.out.println(userName);
		/*
		 * String header = request.getHeader("Authorization");
		 * System.out.println("Auth Headesr" +header); String[] headers =
		 * header.split(" "); System.out.println(" Array Headers "+headers);
		 * String token = headers[1]; String decode= new
		 * String(Base64.getDecoder().decode(token)); String string =
		 * decode.split(":")[0]; System.out.println("userName is= "+string);
		 */
		String username = request.getParameter("name");
		String password = request.getParameter("password");

		System.out.println("userName And Password" + username + "  " + password);
		if (userName != null && !userName.isEmpty()) {
			if (userName.equalsIgnoreCase("raju"))
				return "getSuperAdminBoard";
		}

		return "home";

	}

	@RequestMapping("/formLogin")
	public String formLogin(HttpServletRequest request) {
		System.out.println("HomeController:formLogin()");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String userName = authentication.getName();
		Collection<? extends GrantedAuthority> authoritiesList = authentication.getAuthorities();
		String role = null;
		for (GrantedAuthority auth : authoritiesList) {
			System.out.println("Role is\t"+auth.getAuthority());
			role = auth.getAuthority();
		}
		/*
		 * System.out.println(userName); String username =
		 * request.getParameter("name"); String password =
		 * request.getParameter("password");
		 * 
		 * System.out.println("userName And Password" + username + "  " +
		 * password);
		 */
		System.out.println("Role is \t"+role);
		if (role != null && !role.isEmpty()) {
			if (userName.equalsIgnoreCase(ServiceConstraints.ROLE_ADMIN))
				System.out.println("HomeController:formLogin() in if ");
				return "getSuperAdminBoard";
		}

		return "home";

	}

	@RequestMapping(value = "/getSignUpPage")
	public String getSignupPage(Model model) {
		model.addAttribute("ManageUserProfileBean", new ManageUserProfileBean());
		List<RoleBean> roles = roleService.getAllRoles();
		List<String> roleList = new ArrayList<String>();
		for (RoleBean roleBean : roles) {
			if (roleBean.getRoleName().equalsIgnoreCase(ServiceConstraints.ROLE_SUPER_ADMIN)) {
				continue;
			}
			roleList.add(roleBean.getRoleName());
		}
		model.addAttribute("roleList", roleList);
		return "getSignUpForm";
	}

	@RequestMapping(value = "/registration")
	public String doSignUp(@ModelAttribute("ManageUserProfileBean") ManageUserProfileBean manageUserProfileBean) {
		System.out.println(manageUserProfileBean.toString());
		ManageUserProfileBean createuserProfile = userProfileservice.createuserProfile(manageUserProfileBean);
		System.out.println(manageUserProfileBean.toString());
		
		return "home";
	}

}
