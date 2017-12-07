package com.dotridge.dao;

import java.util.List;

<<<<<<< HEAD
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dotridge.domain.LabTestCategories;
import com.dotridge.domain.Patient;
import com.dotridge.util.SesssionFactoryUtil;

public class PatientDaoImpl implements Patientdao {

	@Override
	public Patient createPatient(Patient patient) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(patient);
		tx.commit();
		return patient;
	}

	@Override
	public Patient getPatientById(int id) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx = sess.beginTransaction();
		Patient patient=(Patient)sess.get(Patient.class, id);
		tx.commit();
		return patient;
		
	}

	@Override
	public Patient updatePatient(Patient patient) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx = sess.beginTransaction();
=======
import com.dotridge.domain.PatientTest;

public class PatientDaoImpl implements PatientTestDao {

	@Override
	public PatientTest createPatientTest(PatientTest patientTest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientTest getPatientTestById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientTest updatePatientTest(PatientTest patientTest) {
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
	public boolean deletePatient(int id) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx = sess.beginTransaction();
=======
	public boolean deletePatientTest(int pId) {
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		// TODO Auto-generated method stub
		return false;
	}

	@Override
<<<<<<< HEAD
	public List<Patient> getPatientByName(String name) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx = sess.beginTransaction();
		String hql = "from Patient p where p.patient like:Patient";
		Query query = sess.createQuery(hql);
		query.setParameter("Patient", "%" + name + "%");
		List<Patient> patient= query.list();
		tx.commit();
		return patient;

	}

	@Override
	public List<Patient> getAllPatients() {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx = sess.beginTransaction();
=======
	public List<PatientTest> getPatientTestByName(String testName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientTest getPatientTestByUniqueName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PatientTest> getAllPatientTests() {
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
	public List<Patient> getAllPatientsByPagianation(int currentPage, int noOfRecPerPage) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx = sess.beginTransaction();
=======
	public List<PatientTest> getAllPatientTestsByPagianation(int currentPage, int noOfRecPerPage) {
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		// TODO Auto-generated method stub
		return null;
	}

}
