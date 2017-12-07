package com.dotridge.config;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.dotridge.util.CustomPasswordEncoder;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
	@Autowired
	SessionFactory sf;
	/*private static final String QUERY = "select up.userId,up.password,r.roleName,p.permissionName from userprofile up,role r,permissions p"
			+ " where p.permissionId=r.permissionId and r.roleId=up.roleId and up.userId=";
*/
	private String QUERY = "select up.userId,up.password,r.roleName from userprofile up,role r"
			+ " where r.roleId=up.role_roleId";

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String userName = authentication.getName();
		String password = (String) authentication.getCredentials();
		password=CustomPasswordEncoder.encodePassword(password);
		QUERY=QUERY+" and up.userId=" + "\'" + userName + "\'"+ "and up.password= "+ "\'" + password + "\'";
		System.out.println("QUERY is\t"+QUERY);
		System.out.println(userName + "and" + password);
	    Session session = sf.openSession();
		SQLQuery sqlQuery = session.createSQLQuery(QUERY );
		List<Object[]> values = sqlQuery.list();
		Object[] arry = values.get(0);
		String userId=(String) arry[0];
		//String passwod=(String) arry[1];
	    String roleName=(String) arry[2];
		//String permissionName  = (String) arry[3];
		List<GrantedAuthority> authorities=new ArrayList<GrantedAuthority>();
		 GrantedAuthority roleauth = new SimpleGrantedAuthority(roleName);
		 //GrantedAuthority permauth = new SimpleGrantedAuthority(permissionName);
		authorities.add(roleauth);
		//authorities.add( permauth);
		
		return new UsernamePasswordAuthenticationToken(userId, password, authorities);

	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

}
