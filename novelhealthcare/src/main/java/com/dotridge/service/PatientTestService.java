package com.dotridge.service;

import java.util.List;

import com.dotridge.bean.PatientTestBean;
import com.dotridge.domain.PatientTest;

public interface PatientTestService {
	public PatientTestBean mapDomainToBean(PatientTest patientTestDomain);

	public PatientTest mapBeanToDomain(PatientTestBean patientTestBean);

	public PatientTestBean createPatientTest(PatientTestBean patientTest);

	public PatientTestBean getPatientTestById(int id);

	public PatientTestBean updatePatientTest(PatientTestBean patientTest);

	public boolean deletePatientTest(int id);

	public List<PatientTestBean> getPatientTestByName(String name);

	public List<PatientTestBean> getAllPatientTests();

	public List<PatientTestBean> getAllPatientTestsByPagianation(int currentPage, int noOfRecPerPage);

}
