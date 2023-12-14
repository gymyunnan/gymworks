package proxyFactory;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyAspectBeforeAdvice implements MethodBeforeAdvice{
	
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("买苹果");
		System.out.println("清洗苹果");
		
	}

}
