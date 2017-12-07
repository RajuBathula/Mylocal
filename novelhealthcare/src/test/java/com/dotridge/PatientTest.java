package com.dotridge;

import java.util.Date;

import com.dotridge.dao.PatientDaoImpl;
import com.dotridge.dao.Patientdao;
import com.dotridge.domain.Patient;

public class PatientTest {

	public static void main(String[] args) {
		Patientdao patDao=new PatientDaoImpl();
		Patient patient=new Patient();
       patient.setAddress("hyd");
       patient.setBloodGroup("b+");
       patient.setCreatedBy("admin");
       patient.setFirstName("raju");
       patient.setLastName("b");
       patient.setMiddleName("yadav");
       patient.setEmail("raj@gmail.com");
       patient.setGender("male");
       patient.setModifiedBy("admin");
       Date date=new Date();
       patient.setCreatedDate(date);
       patient.setModifiedDate(date);
       patient.setPassword("raj1223");
       patient.setPhone(97854612);
       patient.setPatTest(null);
       patient.setStatus(true);
       patient.setRequiredDocument("ahgs");
       Patient createPatient = patDao.createPatient(patient);
       System.out.println(createPatient);

	}

}
