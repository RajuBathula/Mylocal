package com.dotridge.service;

import java.util.List;

import com.dotridge.bean.TestTypeBean;
import com.dotridge.domain.TestType;

public interface TestTypeService {
	public TestTypeBean mapDomainToBean(TestType testTypeDomain);

	public TestType mapBeanToDomain(TestTypeBean testTypeBean);

	public TestTypeBean createTestType(TestTypeBean testType);

	public TestTypeBean getTestTypeById(int id);

	public TestTypeBean updateTestType(TestTypeBean testType);

	public boolean deleteTestType(int id);

	public List<TestTypeBean> getTestTypeByName(String name);

	public List<TestTypeBean> getAllTestTypes();

	
}
