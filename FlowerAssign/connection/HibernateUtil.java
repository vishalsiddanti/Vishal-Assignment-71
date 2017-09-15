package com.hib.assign.connection;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Hiberclass {
	
	private static final SessionFac sessionFac;

	static {
		try {
		StandardServiceRegistry standardRegistry = 
		new StandardServiceRegistryBuilder().configure("hibconfig.xml").build();
		Metadata metaData = 
		new MetadataSources(standardRegistry).getMetadataBuilder().build();
			sessionFactory = metaData.getSessionFactoryBuilder().build();
		} catch (Throwable th) {

			System.err.println("Throwing Exception" + th);
			throw new ExceptionInInitializerError(th);

		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
