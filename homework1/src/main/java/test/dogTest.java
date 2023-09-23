package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import animal.Dog;

public class dogTest {
	public static void main(String[] args) throws Exception {
//	 Class<?> cla =	Class.forName("animal.Dog");
	 Class<?> cla = Dog.class;
	 
	 Dog dog = (Dog)cla.getDeclaredConstructor().newInstance();
	 System.out.println(dog.info());
	 
	 Constructor[] constructors = cla.getConstructors();
	 for(Constructor constructor : constructors) {
		 System.out.println("构造器名称："+constructor.getName());
	 }
	 
	 Field[] fields =  cla.getDeclaredFields();
	 for(Field field: fields) {
		 System.out.println("属性名字："+field.getName());
		 System.out.println("属性类型："+field.getType());
	 }
	 
	 Method[] methords = cla.getDeclaredMethods();
	 for(Method method:methords) {
		 System.out.println("方法名称："+method.getName());
		 System.out.println("方法返回类型"+method.getReturnType());
	 }
	 
	 System.out.println("所在包为："+cla.getPackageName());
	 
	 Class[] inners = cla.getDeclaredClasses();
	 for(Class inner :inners) {
		 System.out.println("内部类："+inner);
	 }
	 
	 Class<?> cls = Class.forName("animal.Dog$Bird");
	 
	 
	}
}
