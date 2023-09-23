package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import student.StudentImpl;
import student.StudentImpl1;

public class testBook {
	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("book_student.xml");
		StudentImpl si = (StudentImpl)appCon.getBean("mystudent");
		StudentImpl1 si1 = (StudentImpl1)appCon.getBean("mystudent1");
		
		System.out.println(si);
		System.out.println(si1);
	}
}

