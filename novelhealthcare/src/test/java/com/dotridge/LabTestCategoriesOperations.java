package com.dotridge;

import com.dotridge.dao.LabTestCategoriesDao;
import com.dotridge.dao.LabTestCategoriesDaoImpl;
import com.dotridge.domain.LabTestCategories;

public class LabTestCategoriesOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LabTestCategoriesDao categoriesDao=new LabTestCategoriesDaoImpl();
		LabTestCategories categories = new LabTestCategories();
		categories.setLabTestCategorie("sugar");
		categories.setDescription("need to test");
		categories.setSatus("true");
		LabTestCategories testCategories = categoriesDao.createLabTestCategories(categories);
		System.out.println(testCategories);
	}

}
