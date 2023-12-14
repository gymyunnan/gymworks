package jdkproxy;

import java.lang.reflect.Proxy;


public class test {

	public static void main(String[] args) {
		//创建代理对象
		AppleProxy appleProxy = new AppleProxy();
		//创建目标对象
		EatApple eatApple = new EatAppleImpl();
		EatApple eatAppleAdvice = (EatApple)appleProxy.createProxy(eatApple);
		eatAppleAdvice.eatAppleRaw();
		System.out.println("--------------");
		eatAppleAdvice.eatAppleCooked();
	}

}
