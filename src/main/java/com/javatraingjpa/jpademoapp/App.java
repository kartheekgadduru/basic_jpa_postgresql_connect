package com.javatraingjpa.jpademoapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Student;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main( String[] args )
	{

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("x");//persistententityunit
		EntityManager em = emf.createEntityManager();
		//Student student = em.find(Student.class, 4);
		Student std = new Student();
		std.setId(5);
		std.setName("Vrun");
		std.setEmail("varun.kar@gmail.com");
		std.setAge(23);
		em.getTransaction().begin(); // DML(delete, insert, update) operation data manipulation opertaion DDL(create table, update table, delete table)
		em.persist(std);			// DRL (read operation)
		em.getTransaction().commit();


		//System.out.println("student: "+ student.getAge());

		// hibernate
		// Configuration cfg = new Configruation()
		// SessionFactory sf = cfg.getSessioFactory();
		//
		// sf.save(std);

	}//model, bean, entity class
}
