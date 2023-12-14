package test;

import java.lang.reflect.Proxy;
import java.util.Scanner;

import dynamicProxy.DynProxy;
import pojo.Geometry;
import pojo.Triangle;

public class DynaApplication {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入三个数：");
		double a = -1;
		double b = -1;
		double c = -1;
		a = reader.nextDouble();
		b = reader.nextDouble();
		c = reader.nextDouble();
		Geometry geometry = (Geometry) Proxy.newProxyInstance(Triangle.class.getClassLoader(),
				new Class[] { Geometry.class }, new DynProxy(a, b, c));
		double area = geometry.getArea();
		System.out.println("面积是：" + area);
	}

}
