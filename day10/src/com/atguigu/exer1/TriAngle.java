package com.atguigu.exer1;

/**
 * @Description 构造器练习：三角形
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年8月26日下午12:20:39
 */

public class TriAngle {

	private double base;//底边长
	private double height;//高
	
	public TriAngle() {
		
	}
	
	public TriAngle(double b,double h) {
		base = b;
		height = h;
	}
	
	public void setBase(double b) {
		base = b;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public double getHeight() {
		return height;
	}
}
