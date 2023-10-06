package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import annotation.controller.TestController;

public class TestMoreAnnotation {
	
	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("annotationContext.xml");
		TestController tC = (TestController)appCon.getBean("testController");
		tC.save();
	}
	
}

