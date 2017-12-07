package com.dotridge.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dotridge.domain.Admin;
import com.dotridge.domain.Role;

@Repository
public class RoleDaoImpl implements RoleDao {
	@Autowired
	SessionFactory sf;

	@Override
	public Role createRole(Role role) {

		return null;
	}

	@Override
	public List<Role> getAllRoles() {
		Session session = sf.openSession();
		String hql = "from Role";
		// String hql = "Select r.roleName from role r where r.roleId between
		// :from and :to";
		Query query = session.createQuery(hql);
		// query.setParameter("from", 2);
		List<Role> roles = query.list();
		return roles;
	}

	@Override
	public Role getRoleByName(String name) {

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		String hql = "from Role r where r.roleName=:RoleName";
		Query query = session.createQuery(hql);
		query.setParameter("RoleName", name);
		Role uniqueResult = (Role) query.uniqueResult();
		return uniqueResult;

	}

}
