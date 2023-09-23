package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class UserProcessor {
	public static void main(String[] args) {
		Method[] methods = null;
		try {
			methods = MyAnnotationTest.class.getDeclaredMethods();
			for (Method method : methods) {
				if(method.isAnnotationPresent(user.class)) {
					user anno = method.getAnnotation( user.class);
					String name = anno.name();
					int age = anno.age();
					System.out.println("Methord:"+method.getName()+";用户名字是"+name+";年龄是"+age);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
