package com.dotridge.dao;

import java.util.List;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePatient(int id) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx = sess.beginTransaction();
		// TODO Auto-generated method stub
		return false;
	}

	@Override
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> getAllPatientsByPagianation(int currentPage, int noOfRecPerPage) {
		SessionFactory ses = SesssionFactoryUtil.getSessionFactory();
		Session sess = ses.openSession();
		Transaction tx = sess.beginTransaction();
		// TODO Auto-generated method stub
		return null;
	}

}
