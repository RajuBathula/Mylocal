package com.dotridge.dao;

import java.util.List;

import com.dotridge.domain.Patient;

public interface Patientdao {
	public Patient createPatient(Patient patient);

	public Patient getPatientById(int id);

	public Patient updatePatient(Patient patient);

	public boolean deletePatient(int id);

	public List<Patient> getPatientByName(String name);

	public List<Patient> getAllPatients();

	public List<Patient> getAllPatientsByPagianation(int currentPage, int noOfRecPerPage);
}
