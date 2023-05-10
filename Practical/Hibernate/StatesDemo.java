package com.states;

import com.tut.ProjectWithMaven.Student;
import com.tut.ProjectWithMaven.Certificate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StatesDemo {

	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Student student = new Student();

		//transient (not in db, not in session)
		student.setId(10101);
		student.setName("Beatrice");
		student.setCity("Paris");
		student.setCerti(new Certificate("Spring Boot", "1.5 months"));
		
//		//Persistent (session, DB)
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		student.setName("Raeliana");
		tx.commit();
		session.close();
//		
//		//detached (in DB, not in session)
//		student.setName("Eun");
		
		
		
		factory.close();
	}
}
