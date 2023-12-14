package jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AppleProxy implements InvocationHandler {

	private EatApple eatApple;

	public Object createProxy(EatApple eatApple) {

		this.eatApple = eatApple;
		ClassLoader cld = AppleProxy.class.getClassLoader();
		Class[] clazz = eatApple.getClass().getInterfaces();
		return Proxy.newProxyInstance(cld, clazz, this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		MyAspect aspect = new MyAspect();
		aspect.buyApple();
		aspect.cleanApple();
		Object result = method.invoke(eatApple, args);
		aspect.dropApple();
		return result;
	}

}
