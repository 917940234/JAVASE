package com.atguigu.exer1;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月30日上午10:14:42
 */

public class CylinderTest {

	public static void main(String[] args) {
		Cylinder cy = new Cylinder();
		
		cy.setRadius(2.1);
		cy.setLength(3.4);
		double volume = cy.findVolume();
		System.out.println("圆柱的体积为：" + volume);

		double area = cy.findArea();
		System.out.println("底面圆的面积为：" + area);
	}
}
