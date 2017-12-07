package com.dotridge.dao;

import java.util.List;

<<<<<<< HEAD
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dotridge.domain.TestType;
import com.dotridge.util.SesssionFactoryUtil;
=======
import com.dotridge.domain.TestType;
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082

public class TestTypeDaoImpl implements TestTypeDao {

	@Override
	public TestType createTestType(TestType testType) {
<<<<<<< HEAD
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
		sess.save(testType);
		return testType;
=======
		return null;
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
	}

	@Override
	public TestType getTestTypeById(int id) {
<<<<<<< HEAD
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		return null;
	}

	@Override
	public TestType updateTestType(TestType testType) {
<<<<<<< HEAD
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		return null;
	}

	@Override
	public boolean deleteTestType(int pId) {
<<<<<<< HEAD
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		return false;
	}

	@Override
	public List<TestType> getTestTypeByName(String testName) {
<<<<<<< HEAD
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		return null;
	}

	@Override
	public TestType getTestTypeByUniqueName(String name) {
<<<<<<< HEAD
		
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		return null;
	}

	@Override
	public List<TestType> getAllTestTypes() {
<<<<<<< HEAD
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		return null;
	}

	@Override
	public List<TestType> getAllTestTypesByPagianation(int currentPage, int noOfRecPerPage) {
<<<<<<< HEAD
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		return null;
	}

}
