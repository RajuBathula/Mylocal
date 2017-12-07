package com.dotridge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dotridge.domain.TestType;
import com.dotridge.util.SesssionFactoryUtil;

public class TestTypeDaoImpl implements TestTypeDao {

	@Override
	public TestType createTestType(TestType testType) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
		sess.save(testType);
		return testType;
	}

	@Override
	public TestType getTestTypeById(int id) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
		return null;
	}

	@Override
	public TestType updateTestType(TestType testType) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
		return null;
	}

	@Override
	public boolean deleteTestType(int pId) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
		return false;
	}

	@Override
	public List<TestType> getTestTypeByName(String testName) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
		return null;
	}

	@Override
	public TestType getTestTypeByUniqueName(String name) {
		
		return null;
	}

	@Override
	public List<TestType> getAllTestTypes() {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
		return null;
	}

	@Override
	public List<TestType> getAllTestTypesByPagianation(int currentPage, int noOfRecPerPage) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx=sess.beginTransaction();
		return null;
	}

}
