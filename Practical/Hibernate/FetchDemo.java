package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String args[]) {
		System.out.println( "Project Started" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session =factory.openSession();
        
        
        //get student
        Student student = (Student)session.get(Student.class, 101);
        System.out.println(student);
        
        //get address
        Address address = (Address)session.get(Address.class, 1);
        System.out.println(address.getStreet());
        session.close();
        factory.close();
	}
}
