package com.dotridge.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dotridge.domain.UserProfile;
@Repository
public class UserProfileDaoImpl implements UserProfileDao {
	@Autowired
	SessionFactory sf;

	@Override
	public UserProfile createUserProfile(UserProfile userProfile) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(userProfile);
		transaction.commit();
		return userProfile;
	}

}
