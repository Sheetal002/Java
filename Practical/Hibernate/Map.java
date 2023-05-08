package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Map {

	public static void main(String args[]) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//Creating Question object
		Question q1 = new Question();
		q1.setQuestionId(1221);
		q1.setQuestion("What is Java");
		
		//Creating Answer
		Answer a1 = new Answer();
		a1.setAnswerId(121);
		a1.setAnswer("Java is a programming language.");
		
		//setting answer in question object
		q1.setAnswer(a1);

		//Creating Question object
		Question q2 = new Question();
		q2.setQuestionId(12321);
		q2.setQuestion("What is Collection Framework?");
		
		//Creating Answer
		Answer a2 = new Answer();
		a2.setAnswerId(122);
		a2.setAnswer("API to work with java objects.");
		
		//setting answer in question object
		q2.setAnswer(a2);

		
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(q1);
		s.save(q2);
		s.save(a1);
		s.save(a2);
		
		tx.commit();
		
		//fetching....
		Question newQ  = (Question)s.get(Question.class, 12321);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
				
		s.close();
		factory.close();
	}
}
