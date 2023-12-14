package annotation_aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Pointcut("@annotation(annotation.TestApple)")
	public void myPointCut() {
		
	}
	
	@Before("myPointCut()")
	public void before(JoinPoint jp) {
		System.out.println("买苹果");
		System.out.println("清洗苹果");
		System.out.println("目标对象："+ jp.getTarget()+"被增强的方法:"+jp.getSignature().getName());
	}
	
	@After("myPointCut()")
	public void after(JoinPoint jp) {
		System.out.println("把苹果丢尽垃圾桶~~");
		System.out.println("目标对象："+ jp.getTarget()+"被增强的方法:"+jp.getSignature().getName());
	}
	
	@Around("myPointCut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("买苹果");
		System.out.println("清洗苹果");
		Object obj = pjp.proceed();
		System.out.println("把苹果丢尽垃圾桶~~");
		return obj;
	}
}
