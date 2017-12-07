package com.dotridge.service;

import java.util.List;

import com.dotridge.bean.LabTestCategoriesBean;
import com.dotridge.domain.LabTestCategories;

public interface LabTestCategoriesService {
	public LabTestCategoriesBean mapDomainToBean(LabTestCategories labTestCategoriesDomain);

	public LabTestCategories mapBeanToDomain(LabTestCategoriesBean labTestCategoriesBean);

	public LabTestCategoriesBean createLabTestCategories(LabTestCategoriesBean labTestCategories);

	public LabTestCategoriesBean getLabTestCategoriesById(int id);

	public LabTestCategoriesBean updateLabTestCategories(LabTestCategoriesBean labTestCategories);

	public boolean deleteLabTestCategories(int id);

	public List<LabTestCategoriesBean> getLabTestCategoriesByName(String name);

	public List<LabTestCategoriesBean> getAllLabTestCategoriess();

	public List<LabTestCategoriesBean> getAllLabTestCategoriessByPagianation(int currentPage, int noOfRecPerPage);
}
