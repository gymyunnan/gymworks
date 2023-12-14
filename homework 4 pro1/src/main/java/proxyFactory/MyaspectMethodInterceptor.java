package proxyFactory;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyaspectMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("买苹果");
		System.out.println("清洗苹果");
		Object obj = invocation.proceed();
		System.out.println("把苹果丢尽垃圾桶~~");
		return obj;
	}
}
