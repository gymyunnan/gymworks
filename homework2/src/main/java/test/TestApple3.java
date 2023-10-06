package test;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import configuration.JavaAppleConfigration;
import controller.AppleController;

public class TestApple3 {

	public static void main(String[] args) {
		 //用纯java方法
		 AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(JavaAppleConfigration.class);
		 AppleController ac = appCon.getBean(AppleController.class);
		 ac.printApple();
		 appCon.close();

	}

}
