package com.dotridge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dotridge.dao.HospitalDao;
import com.dotridge.dao.HospitalDaoImpl;
import com.dotridge.domain.Hospital;
import com.dotridge.util.SesssionFactoryUtil;

public class HibernateCacheTesting {
	@Autowired
	private SessionFactory factory;
	@Autowired
	private HospitalDao hospDao;

	/*public static void secondLevelCacheSingleEntity() {
		
	    Session session = SesssionFactoryUtil.getSessionFactory().openSession();
		
		Hospital hosp = (Hospital) session.get(Hospital.class, 1);
		System.out.println(hosp);
		session.close();
		Session session2 = SesssionFactoryUtil.getSessionFactory().openSession();
		Hospital hosp1 = (Hospital) session.get(Hospital.class, 1);
		System.out.println(hosp1);
		session2.close();
	}

	public static void secondLevelCacheQueryTest() {
		
		Session session = SesssionFactoryUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from Hospital");
		query.setCacheable(true);
		query.list();
		session.close();
		Session session2 = SesssionFactoryUtil.getSessionFactory().openSession();
		Query query2 = session2.createQuery("from Hospital");
		query2.setCacheable(true);
		query2.list();
		session2.close();
	}
*/
	public static void main(String[] args) {
		// secondLevelCacheQueryTest();
		
		Session session =SesssionFactoryUtil.getSessionFactory().openSession();
		 
		  HospitalDao hospDao = new HospitalDaoImpl(); 
		  Hospital hospitalById = hospDao.getHospitalById(1); 
		  Hospital hospitalById2 = hospDao.getHospitalById(1); System.out.println(hospitalById);
		 System.out.println(hospitalById2); session.close();
		 

	}

}
