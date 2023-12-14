package staticProxy;

import pojo.Geometry;
import pojo.Triangle;

public class TriangleProxy implements Geometry {

	double sideA, sideB, sideC, area;
	Triangle triangle;


	public void setABC(double a, double b, double c) {
		sideA = a;
		sideB = b;
		sideC = c;
	}

	@Override
	public double getArea() {
		if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
			triangle = new Triangle(sideA, sideB, sideC);
			System.out.println("计算之前~~");
			double area = triangle.getArea();
			System.out.println("计算之后~~");
			return area;
		} else {
			return -1;
		}
	}
}
