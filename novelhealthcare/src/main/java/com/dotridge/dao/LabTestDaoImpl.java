package com.dotridge.dao;

import java.util.List;

<<<<<<< HEAD
import org.hibernate.Query;
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dotridge.domain.LabTest;
<<<<<<< HEAD
import com.dotridge.util.SesssionFactoryUtil;

public class LabTestDaoImpl implements LabTestDao {
	// private SessionFactory sf;
	@Override
	public LabTest createLabTest(LabTest labTest) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		// Session sess = sf.openSession();
=======

public class LabTestDaoImpl implements LabTestDao {
	private SessionFactory sf;
	@Override
	public LabTest createLabTest(LabTest labTest) {
		Session sess = sf.openSession();
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		Transaction tx = sess.beginTransaction();
		sess.save(labTest);
		tx.commit();
		return labTest;
	}

	@Override
	public LabTest getLabTestById(int id) {
<<<<<<< HEAD
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		// Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		LabTest labTest = (LabTest) sess.get(LabTest.class, id);
=======
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		LabTest labTest=(LabTest)sess.get(LabTest.class, id);
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		tx.commit();
		return labTest;
	}

	@Override
	public LabTest updateLabTest(LabTest labTest) {
<<<<<<< HEAD
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx = sess.beginTransaction();
		sess.update(labTest);
		return labTest;
=======
		return null;
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
	}

	@Override
	public boolean deleteLabTest(int pId) {
<<<<<<< HEAD
		Session ses = SesssionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();
		LabTest labTest = (LabTest) ses.get(LabTest.class, pId);
		ses.delete(labTest);
		LabTest labTest1 = (LabTest) ses.get(LabTest.class, pId);
		return (labTest1 == null ? true : false);
=======
		return false;
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
	}

	@Override
	public List<LabTest> getLabTestByName(String testName) {
<<<<<<< HEAD
		Session ses = SesssionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();
		String hql = "from LabTest l where l.testName like:TestName";
		Query query = ses.createQuery(hql);
		query.setParameter("Testname", "%" + testName + "%");
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		return null;
	}

	@Override
	public LabTest getLabTestByUniqueName(String name) {
<<<<<<< HEAD
		Session ses = SesssionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();

=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		return null;
	}

	@Override
	public List<LabTest> getAllLabTests() {
<<<<<<< HEAD
		Session ses = SesssionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = ses.beginTransaction();

=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		return null;
	}

	@Override
	public List<LabTest> getAllLabTestsByPagianation(int currentPage, int noOfRecPerPage) {
<<<<<<< HEAD

=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		return null;
	}

}
