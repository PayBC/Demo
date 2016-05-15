package com.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String a[])
	{
		Persistence p= new Persistence();
		EntityManagerFactory m=p.createEntityManagerFactory("JPAProj");
		EntityManager em=m.createEntityManager();
		Employee e= new Employee();
		//e.setUserid(3);
		e.setUsername("HArry");
		em.persist(e);
		Employee emp=em.find(Employee.class,1);
		System.out.println(emp.getUsername());
		em.close();
		
	}

}
