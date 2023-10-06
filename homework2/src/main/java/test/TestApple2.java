package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.AppleAnnotationConfig;
import controller.AppleController;

public class TestApple2 {
	public static void main(String[] args) {
		//用全自动注解
		AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(AppleAnnotationConfig.class);
		AppleController ac = appCon.getBean(AppleController.class);
		ac.printApple();
		appCon.close();
	}
	
}
