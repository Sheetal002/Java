package com.tut.ProjectWithMaven;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        //creating student
        Student st = new Student();
        st.setId(101);
        st.setName("Aurelia");
        st.setCity("Tokyo");
        System.out.println(st);
        
        Student st1 = new Student();
        st1.setId(102);
        st1.setName("Siesta");
        st1.setCity("Seoul");
        System.out.println(st1);
        
        Student st2 = new Student();
        st2.setId(103);
        st2.setName("Snehal");
        st2.setCity("Pune");
        System.out.println(st2);
        
        Student st3 = new Student();
        st3.setId(104);
        st3.setName("Yoora");
        st3.setCity("California");
        System.out.println(st3);
        
        //creating object of Address class
        Address ad = new Address();
        ad.setStreet("Baker's Street");
        ad.setCity("London");
        ad.setOpen(true);
        ad.setX(123.45);
        ad.setAddedDate(new Date());
        
        //Reading image
        FileInputStream fis =new FileInputStream("src/main/java/siesta.jpg");
        byte[] data= new byte[fis.available()];
        fis.read();
        ad.setImage(data);
        fis.close();
        
        Address ad1 = new Address();
        ad1.setStreet("Central Park");
        ad1.setCity("New York");
        ad1.setOpen(true);
        ad1.setX(123.45);
        ad1.setAddedDate(new Date());
        
        //Reading image
        FileInputStream fis1 =new FileInputStream("src/main/java/pic2.jpg");
        byte[] data1= new byte[fis1.available()];
        fis1.read();
        ad1.setImage(data1);
        fis1.close();
        
        Session session = factory.openSession();
        ///
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        session.save(st1);
        session.save(st2);
        session.save(st3);
        session.save(ad);
        session.save(ad1);
        tx.commit();
        
        session.close();
        
    }
}
