package test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.AppleController;

public class TestApple {

	public static void main(String[] args) {
		//用setter方法
		 ApplicationContext appCon = new ClassPathXmlApplicationContext("AppleApplication.xml");
		 AppleController ac = (AppleController)appCon.getBean("myAppleController");
		 ac.printApple();

	}

}
