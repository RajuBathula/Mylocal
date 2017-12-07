package com.dotridge;

import com.dotridge.dao.LabTestCategoriesDao;
import com.dotridge.dao.LabTestCategoriesDaoImpl;
import com.dotridge.dao.LabTestDao;
import com.dotridge.dao.LabTestDaoImpl;
import com.dotridge.domain.LabTest;
import com.dotridge.domain.LabTestCategories;

public class LabTestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabTestCategoriesDao categoriesDao=new LabTestCategoriesDaoImpl();
		LabTestDao testDao=new LabTestDaoImpl();
		LabTest test = new LabTest();
		test.setTestName("Blood");
		test.setReferenceRange(350);
		test.setStatus("true");
		test.setUnit(45);
		LabTestCategories categoriesById = categoriesDao.getLabTestCategoriesById(1);
		test.setTestCategories(categoriesById);
		LabTest createLabTest = testDao.createLabTest(test);
		System.out.println(createLabTest);
	}

}
