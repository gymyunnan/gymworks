package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import pojo.Geometry;
import pojo.Triangle;

public class DynProxy implements InvocationHandler {

	private Geometry geometry;

	private boolean isTriangleValid(double side1, double side2, double side3) {
		// 验证三角形的逻辑，判断三个数值是否能构成三角形
		return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
	}

	public  DynProxy(double side1, double side2, double side3) {
		// 验证输入的三个数值是否能构成三角形，如果不能构成，可以在此处抛出异常或返回特定值
		if (!isTriangleValid(side1, side2, side3)) {
			throw new IllegalArgumentException("请输入有效边~~");
		}
		// 创建真实的Triangle对象
		this.geometry = new Triangle(side1, side2, side3);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		try {
			System.out.println("计算之前~~");
			result = method.invoke(this.geometry, args);
			System.out.println("计算之后~~");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

}
