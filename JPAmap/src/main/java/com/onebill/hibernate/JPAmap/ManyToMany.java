                  package com.onebill.hibernate.JPAmap;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Course;
import com.onebill.hibernate.bean.Student;

public class ManyToMany {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory = null;
		EntityManager entitymanager = null;
		EntityTransaction entitytransaction = null;

		Student student1 = new Student();
		student1.setSid(1);
		student1.setSname("Rahul");
		
		Student student2 = new Student();
		student2.setSid(2);
		student2.setSname("Rani");

		Course course1 = new Course();
		course1.setCid(10);
		course1.setCname("Java");
		
		Course course2 = new Course();
		course2.setCid(20);
		course2.setCname("Python");
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		
		course1.setStudents(students);
		course2.setStudents(students);
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		
		student1.setCourses(courses);
		student2.setCourses(courses);
		
		try {

			entitymanagerfactory = Persistence.createEntityManagerFactory("mapping");
			entitymanager = entitymanagerfactory.createEntityManager();
			entitytransaction = entitymanager.getTransaction();
			entitytransaction.begin();
			entitymanager.persist(course1);
			entitytransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
