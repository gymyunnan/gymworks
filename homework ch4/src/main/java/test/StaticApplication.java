package test;

import java.util.Scanner;

import staticProxy.TriangleProxy;

public class StaticApplication {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入三个数：");
		double a = -1;
		double b = -1;
		double c = -1;
		a = reader.nextDouble();
		b = reader.nextDouble();
		c = reader.nextDouble();
		TriangleProxy proxy = new TriangleProxy();
		proxy.setABC(a, b, c);
		double area = proxy.getArea();
		System.out.println("面积是：" + area);
	}
}
