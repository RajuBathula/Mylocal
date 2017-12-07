package com.dotridge.service;

import java.util.List;

import com.dotridge.bean.AdminBean;
import com.dotridge.bean.LabTestBean;
import com.dotridge.domain.Admin;
import com.dotridge.domain.LabTest;

public interface LabTestService {
	public LabTestBean mapDomainToBean(LabTest labTestDomain);

	public LabTest mapBeanToDomain(LabTestBean labTestBean);

	public LabTestBean createLabTest(LabTestBean labTest);

	public LabTestBean getLabTestById(int id);

	public LabTestBean updateLabTest(LabTestBean labTest);

	public boolean deleteLabTest(int Id);

	public List<LabTestBean> getLabTestByName(String name);

	public List<LabTestBean> getAllLabTests();

	public List<LabTestBean> getAllLabTestsByPagianation(int currentPage, int NoOfRecPerPage);

}
