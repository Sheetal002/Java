package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {

	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Student student1 = new Student();
		student1.setId(10101);
		student1.setName("Aurelia");
		student1.setCity("Paris");
		
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Android Development");
		certificate1.setDuration("2 months");
		
		student1.setCerti(certificate1);
		
		Student student2 = new Student();
		student2.setId(10102);
		student2.setName("Siesta");
		student2.setCity("London");
		
		Certificate certificate2 = new Certificate();
		certificate2.setCourse("Hibernate");
		certificate2.setDuration("1.5 months");
		
		student2.setCerti(certificate2);
				
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		session.save(student1);
		session.save(student2);
		t.commit();
		session.close();
		factory.close();
	}
}
