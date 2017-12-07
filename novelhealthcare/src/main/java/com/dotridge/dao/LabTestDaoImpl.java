package com.dotridge.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dotridge.domain.LabTest;
import com.dotridge.util.SesssionFactoryUtil;

public class LabTestDaoImpl implements LabTestDao {
	// private SessionFactory sf;
	@Override
	public LabTest createLabTest(LabTest labTest) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		// Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(labTest);
		tx.commit();
		return labTest;
	}

	@Override
	public LabTest getLabTestById(int id) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		// Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		LabTest labTest = (LabTest) sess.get(LabTest.class, id);
		tx.commit();
		return labTest;
	}

	@Override
	public LabTest updateLabTest(LabTest labTest) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx = sess.beginTransaction();
		sess.update(labTest);
		return labTest;
	}

	@Override
	public boolean deleteLabTest(int pId) {
		Session ses = SesssionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();
		LabTest labTest = (LabTest) ses.get(LabTest.class, pId);
		ses.delete(labTest);
		LabTest labTest1 = (LabTest) ses.get(LabTest.class, pId);
		return (labTest1 == null ? true : false);
	}

	@Override
	public List<LabTest> getLabTestByName(String testName) {
		Session ses = SesssionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();
		String hql = "from LabTest l where l.testName like:TestName";
		Query query = ses.createQuery(hql);
		query.setParameter("Testname", "%" + testName + "%");
		return null;
	}

	@Override
	public LabTest getLabTestByUniqueName(String name) {
		Session ses = SesssionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();

		return null;
	}

	@Override
	public List<LabTest> getAllLabTests() {
		Session ses = SesssionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();

		return null;
	}

	@Override
	public List<LabTest> getAllLabTestsByPagianation(int currentPage, int noOfRecPerPage) {

		return null;
	}

}
