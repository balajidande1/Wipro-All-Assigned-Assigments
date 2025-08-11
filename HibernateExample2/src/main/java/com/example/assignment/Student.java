package com.example.assignment;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.assignment.entity.StudentEntity;
import com.example.assignment.util.HibernateUtil;

public class Student {
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		StudentEntity student = new StudentEntity("Balaji", 
				"Dande", "balaji123", StudentEntity.Gender.MALE, 
				"Nellore district", LocalDate.of(2001, 4, 29));
		session.persist(student);
		tx.commit();
		session.close();
		
		//read
		session = HibernateUtil.getSessionFactory().openSession();
		StudentEntity studentData = session.get(StudentEntity.class, student.getRollno());
		System.out.println("Fetched from Database:" + studentData);
		session.close();
		
		//update
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
		studentData.setAddress("Vinjamur, Nellore district");
		session.merge(studentData);
		tx.commit();
		session.close();
		
		//delete
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
		session.remove(studentData);
		tx.commit();
		session.close();
		System.out.println("User got deleted" + studentData);
	}

}
