package com.map1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.*;
public class DemoMap2 {

	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//Creating Project Objects
		Project p1 = new Project();
		p1.setProjectId(1221);
		p1.setProjectName("ChatBot");
		
		Project p2 = new Project();
		p2.setProjectId(1222);
		p2.setProjectName("Ticket Booking Application");
		
		Project p3 = new Project();
		p3.setProjectId(1223);
		p3.setProjectName("Puzzle Application");
		
		//Creating Employee Objects
		Emp e1 = new Emp();
		e1.setEmpId(11);
		e1.setEmpName("Aurelia");
		
		Emp e2 = new Emp();
		e2.setEmpId(12);
		e2.setEmpName("Siesta");
		
		List<Project> list1 = new ArrayList<Project>();
		list1.add(p1);
		list1.add(p2);
		
		List<Project> list2 = new ArrayList<Project>();
		list2.add(p1);
		list2.add(p3);
		
		List<Emp> list3 = new ArrayList<Emp>();
		list3.add(e1);
		list3.add(e2);

		List<Emp> list4 = new ArrayList<Emp>();
		list4.add(e1);
		
		p1.setEmployees(list3);
		p2.setEmployees(list4);
		e1.setProjects(list1);
		e2.setProjects(list2);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(e1);
		session.save(e2);
		tx.commit();
		
		Emp project_per_emp  = (Emp)session.get(Emp.class, 11);
		System.out.println(project_per_emp.getEmpName());
		for (Project p: project_per_emp.getProjects()) {
			System.out.println(p.getProjectName());
		}
		
		session.close();
		factory.close();
	}
}
