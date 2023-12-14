package annotation_aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import proxyFactory.EatApple;

public class test {

	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("/annotation_aspect/applicationContext.xml");
		EatApple testEatAppleAdvice = (EatApple)appCon.getBean("eatAppleImpl");
		testEatAppleAdvice.eatAppleRaw();
		System.out.println("----------------");
		testEatAppleAdvice.eatAppleCooked();
	}

}
