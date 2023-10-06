package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import configuration.JavaAppleConfigration;
import controller.AppleController;

public class TestApple1 {
	public static void main(String[] args) {
		//用注解半自动方法
		ApplicationContext appCon = new ClassPathXmlApplicationContext("AppleAnnotationConfig.xml");
		AppleController ac = (AppleController)appCon.getBean("appleController");
		ac.printApple();
		}
}
