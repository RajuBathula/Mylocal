package com.dotridge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dotridge.domain.PatientTest;
import com.dotridge.util.SesssionFactoryUtil;

public class PatientTestDaoImpl implements PatientTestDao {
	//private SessionFactory sf;

	@Override
	public PatientTest createPatientTest(PatientTest patientTest) {
		//Session sess = sf.openSession();
		Session session = SesssionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(patientTest);
		tx.commit();
		return patientTest ;
	}

	@Override
	public PatientTest getPatientTestById(int id) {
		Session session = SesssionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		PatientTest patTest =(PatientTest) session.get(PatientTest.class, id);
		tx.commit();
		return patTest;
	}

	@Override
	public PatientTest updatePatientTest(PatientTest patientTest) {
		Session session = SesssionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(patientTest);
		tx.commit();
		return patientTest;
	}

	@Override
	public boolean deletePatientTest(int pId) {
		Session session = SesssionFactoryUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		PatientTest patTest=(PatientTest)session.get(PatientTest.class, pId);
		
		return false;
	}

	@Override
	public List<PatientTest> getPatientTestByName(String testName) {
		return null;
	}

	@Override
	public PatientTest getPatientTestByUniqueName(String name) {
		return null;
	}

	@Override
	public List<PatientTest> getAllPatientTests() {
		return null;
	}

	@Override
	public List<PatientTest> getAllPatientTestsByPagianation(int currentPage, int noOfRecPerPage) {
		return null;
	}

}
