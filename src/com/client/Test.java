package com.client;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.model.Student;

public class Test {

	public static void main(String[] args) {

		
		//Student s=new Student();
		
		
//		s.setRollno(4);
//		s.setName("jit");
		
		Session se=HibernateUtil.getSessionFactory().openSession();
		
		//se.persist(s);//save method is in Hibernate 5.X version , now in 6.X we use persist() instead of save
		
		//se.beginTransaction().commit();
		
//		Student s=se.get(Student.class, 6);
//		
//		Student  s1=se.get(Student.class, 6);
//		
//		Student s2=se.get(Student.class, 6);
		
		
        Student s=se.get(Student.class, 4);
		
        se.clear();
        
		Student  s1=se.get(Student.class, 4);
		
		Student s2=se.get(Student.class, 4);
		
		
		
		//Session session=HibernateUtil.getSessionFactory().openSession();
		
		//session.evict(s1);
		
		//Student a=session.get(Student.class, 4);
		
		//Student b=session.get(Student.class, 4);
		
		//System.out.println(s.getRollno());
		
		//System.out.println(s.getName());
		
	}

}
