package proxyFactory;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class test {

	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("/proxyFactory/applicationContext.xml");
		EatApple eatAppleAdvice = (EatApple)appCon.getBean("eatAppleProxy");
		eatAppleAdvice.eatAppleRaw();
		System.out.println("-------------------");
		eatAppleAdvice.eatAppleCooked();
	}

}
