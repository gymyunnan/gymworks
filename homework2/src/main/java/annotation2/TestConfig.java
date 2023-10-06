package annotation2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import annotation2.controller.TestController;

public class TestConfig {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appCon = new AnnotationConfigApplicationContext(JavaConfig.class);
		TestController tc = appCon.getBean(TestController.class);
		tc.save();
		appCon.close();
	}
}
