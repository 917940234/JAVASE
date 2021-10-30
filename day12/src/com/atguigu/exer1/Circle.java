package com.atguigu.exer1;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年8月30日上午10:08:55
 */

public class Circle {

	private double radius;//半径
	
	public Circle() {
		radius = 1.0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * 
	 * @Description 求圆的面积
	 * @author	Youcheng_Zong	
	 * @date	2021年8月30日上午10:10:10
	 * @return 返回圆的面积
	 */
	public double findArea() {
		return Math.PI * radius * radius;
	}
}
