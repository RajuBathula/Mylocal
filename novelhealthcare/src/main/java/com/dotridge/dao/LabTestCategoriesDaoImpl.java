package com.dotridge.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dotridge.domain.LabTestCategories;
<<<<<<< HEAD
import com.dotridge.util.SesssionFactoryUtil;

public class LabTestCategoriesDaoImpl implements LabTestCategoriesDao {
	//private SessionFactory sf;

	@Override
	public LabTestCategories createLabTestCategories(LabTestCategories labTestCategories) {
		//Session session = sf.openSession();
		SessionFactory sf=SesssionFactoryUtil.getSessionFactory();
=======

public class LabTestCategoriesDaoImpl implements LabTestCategoriesDao {
	private SessionFactory sf;

	@Override
	public LabTestCategories createLabTestCategories(LabTestCategories labTestCategories) {
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(labTestCategories);
		transaction.commit();
		return labTestCategories;
	}

	@Override
	public LabTestCategories getLabTestCategoriesById(int id) {
<<<<<<< HEAD
		//Session session = sf.openSession();
		SessionFactory sf=SesssionFactoryUtil.getSessionFactory();
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		LabTestCategories lab = (LabTestCategories) session.get(LabTestCategories.class, id);
		transaction.commit();
		return lab;
	}

	@Override
	public LabTestCategories updateLabTestCategories(LabTestCategories labTestCategories) {
<<<<<<< HEAD
		//Session session = sf.openSession();
		SessionFactory sf=SesssionFactoryUtil.getSessionFactory();
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(labTestCategories);
		transaction.commit();
		return labTestCategories;
	}

	@Override
	public boolean deleteLabTestCategories(int pId) {
<<<<<<< HEAD
		//Session session = sf.openSession();
		SessionFactory sf=SesssionFactoryUtil.getSessionFactory();
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		LabTestCategories labCat = (LabTestCategories) session.get(LabTestCategories.class, pId);
		session.delete(labCat);
		transaction.commit();
		LabTestCategories lab = (LabTestCategories) session.get(LabTestCategories.class, pId);
		return (lab == null ? true : false);
	}

	@Override
	public List<LabTestCategories> getLabTestCategoriesByName(String catgryName) {
<<<<<<< HEAD
		//Session session = sf.openSession();
		SessionFactory sf=SesssionFactoryUtil.getSessionFactory();
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		String hql = "from LabTestCategories l where l.labTestCategorie like:TestCategorie";
		Query query = session.createQuery(hql);
		query.setParameter("TestCategorie", "%" + catgryName + "%");
		List<LabTestCategories> testCategorieList= query.list();
		return testCategorieList;
	}

	@Override
	public LabTestCategories getLabTestCategoriesByUniqueName(String name) {
<<<<<<< HEAD
		SessionFactory sf=SesssionFactoryUtil.getSessionFactory();
		Session session = sf.openSession();
=======
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		return null;
	}

	@Override
	public List<LabTestCategories> getAllLabTestCategoriess() {
<<<<<<< HEAD
	//	Session session = sf.openSession();
		SessionFactory sf=SesssionFactoryUtil.getSessionFactory();
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		String hql="from LabTestCategories";
		Query query = session.createQuery(hql);
		List<LabTestCategories> categories = query.list();
		return categories;
	}

	@Override
	public List<LabTestCategories> getAllLabTestCategoriessByPagianation(int currentPage, int noOfRecPerPage) {
<<<<<<< HEAD
		//Session session = sf.openSession();
		SessionFactory sf=SesssionFactoryUtil.getSessionFactory();
=======
>>>>>>> 28fd609428943cbdc10d8ea23539343f17ec1082
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		String hql="from LabTestCategories";
		Query query = session.createQuery(hql);
		query.setFirstResult((currentPage-1)*noOfRecPerPage);
		query.setMaxResults(noOfRecPerPage);
		List<LabTestCategories> categories = query.list();
		return categories;
	}

}
