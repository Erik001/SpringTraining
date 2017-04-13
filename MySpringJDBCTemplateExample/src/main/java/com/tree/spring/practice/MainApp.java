package com.tree.spring.practice;

import java.util.List;
import java.util.TimeZone;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tree/configuration/appContext.xml");
		// ApplicationContext context = new
		// FileSystemXmlApplicationContext("appContext.xml");

		StudentJDBCTemplate studentJDBCTemplate = context.getBean("studentJDBCTemplate", StudentJDBCTemplate.class);
		System.out.println(TimeZone.getDefault());
		System.out.println("------Records Creation-----");
		studentJDBCTemplate.create("Taco", 10);
		studentJDBCTemplate.create("Erik", 20);
		studentJDBCTemplate.create("Ian", 8);

		System.out.println("------Listing Multiple Records-----");
		List<Student> students = studentJDBCTemplate.listStudents();
		for (Student st : students) {
			System.out.print("ID: " + st.getId());
			System.out.print(", Name: " + st.getName());
			System.out.println(", Age: " + st.getAge());
		}

		System.out.println("------Updating Record With ID: 2-----");
		studentJDBCTemplate.update(2, 40);

		System.out.println("------Listing Record With ID: 2-----");
		Student student = studentJDBCTemplate.getStudent(2);
		System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());

		System.out.println("------Deleting Record With ID: 2-----");
		studentJDBCTemplate.delete(2);

		System.out.println("------Listing Multiple Records After Removing Record With ID: 2-----");
		List<Student> students2 = studentJDBCTemplate.listStudents();
		for (Student st : students2) {
			System.out.print("ID: " + st.getId());
			System.out.print(", Name: " + st.getName());
			System.out.println(", Age: " + st.getAge());
		}
	}

}
