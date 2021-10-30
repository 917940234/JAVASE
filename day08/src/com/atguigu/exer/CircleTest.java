package com.atguigu.exer;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月24日上午11:13:13
 */

public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		c1.radius = 2.1;
		
		//对应方式一
//		double area = c1.findArea();
//		System.out.println(area);
		//对应方式二
		c1.findArea();
		
	}
}

class Circle{
	
	//属性
	double radius;
	
	//求圆的面积
	//方式一：
//	public double findArea() {
//		double area = Math.PI * radius * radius;
//		return area;
	
	//方式二：
	public void findArea() {
		double area = Math.PI * radius * radius;
		System.out.println("面积为：" + area);	
	}
	
	//错误情况
//	public double findArea(double r) {
//		double area = 3.13 * r * r;
//		return area;
//	}
}