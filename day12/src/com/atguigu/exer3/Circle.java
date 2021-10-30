package com.atguigu.exer3;

/**
 * @Description	圆的练习
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月1日上午9:28:43
 */

public class Circle {

	private double radius;
	
	public Circle() {
		radius = 1;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double findArea() {
		return Math.PI * radius * radius;
	}
}
