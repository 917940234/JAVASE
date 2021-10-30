package com.atguigu.exer1;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月30日上午10:14:51
 */

public class Cylinder extends Circle{

	private double length;//高
	
	public Cylinder() {
		length = 1.0;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	/**
	 * 
	 * @Description 求圆柱体积
	 * @author	Youcheng_Zong	
	 * @date	2021年8月30日上午10:12:44
	 * @return 返回圆柱体积
	 */
	public double findVolume() {
//		return Math.PI * getRadius() * getRadius() * getLength();
		return findArea() * getLength();
	}
}
