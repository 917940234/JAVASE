package com.atguigu.exer3;

/**
 * @Description 圆的练习
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月1日上午9:32:12
 */

public class Cylinder extends Circle{

	private double length;

	public Cylinder() {
		super();
		length = 1;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double findVolume() {
		return super.findArea() * length;
	}
	
	public double findArea() {
		return super.findArea() + super.findArea() + Math.PI * getRadius() * 2 * length;
	}
}
