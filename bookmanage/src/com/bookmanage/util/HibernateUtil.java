package com.bookmanage.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

public class HibernateUtil {
	// session����
	private static SessionFactory fa = null;

	/**
	 * ��ȡ�����ö���
	 * 
	 * @return
	 */
	public static Configuration getConfig() {
		Configuration config = new Configuration().configure();
		return config;

	}
	/**
	 * ��ȡsession��������
	 * @return
	 */
	public static SessionFactory getSessionFactory() {

		if (fa == null) {
			fa = getConfig().buildSessionFactory();
		}
		return fa;
	}
	
	/**
	 * ��ȡsession
	 * @return
	 */
	public static Session getSession() {
		Session session = getSessionFactory().openSession();
		return session;
	}
}
