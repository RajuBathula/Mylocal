package com.dotridge;

import java.util.Date;

import com.dotridge.dao.PatientDaoImpl;
import com.dotridge.dao.PatientTestDao;
import com.dotridge.dao.PatientTestDaoImpl;
import com.dotridge.dao.Patientdao;
import com.dotridge.domain.Patient;
import com.dotridge.domain.PatientTest;

public class PatientTestCheck {

	public static void main(String[] args) {
		PatientTestDao patDao=new PatientTestDaoImpl();
		Patientdao patientdao=new PatientDaoImpl();
		PatientTest patTest = new PatientTest();
		Date dt = new Date();
		patTest.setDeliveryDate(dt);
		patTest.setTestDate(dt);
		Patient patientById = patientdao.getPatientById(1);
		patTest.setPatient(patientById);
        PatientTest createPatientTest = patDao.createPatientTest(patTest);
        System.out.println(createPatientTest);
	}

}
