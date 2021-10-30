package com.atguigu.exer1;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月1日下午1:43:25
 */

public class GeometricTest {

	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();

		Circle c1 = new Circle(2.3, "white", 1.0);				
		test.displayGeometricObject(c1);
	
		Circle c2 = new Circle(3.3, "white", 1.0);			
		test.displayGeometricObject(c2);
		
		boolean isEquals = test.equalsArea(c1, c2);
		System.out.println("c1和c2的面积是否相等" + isEquals);
		
		MyRectangle rect = new MyRectangle(2.1, 3.4, "red", 2.0);
		test.displayGeometricObject(rect);
	}
	
	public void displayGeometricObject(GeometricObject o) {
		System.out.println("面积为：" + o.findArea());
	}
	
	//测试两个对象的面积是否相等
	public boolean equalsArea(GeometricObject o1,GeometricObject o2) {
		return o1.findArea() == o2.findArea();
	}
}
