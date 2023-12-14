package aspect1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public void before(JoinPoint jp) {
		System.out.println("买苹果");
		System.out.println("清洗苹果");
		System.out.println("目标对象："+ jp.getTarget()+"被增强的方法:"+jp.getSignature().getName());
	}
	
	public void after(JoinPoint jp) {
		System.out.println("把苹果丢尽垃圾桶~~");
		System.out.println("目标对象："+ jp.getTarget()+"被增强的方法:"+jp.getSignature().getName());
	}
	
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("买苹果");
		System.out.println("清洗苹果");
		Object obj = pjp.proceed();
		System.out.println("把苹果丢尽垃圾桶~~");
		return obj;
	}
}
