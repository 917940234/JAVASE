package com.atguigu.exer3;

/**
 * @Description 测试
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月1日上午9:38:45
 */

public class Test {

	public static void main(String[] args) {
		Cylinder cy = new Cylinder();
		
		cy.setRadius(1);
		cy.setLength(1);
		
		System.out.println("圆柱表面积为：" + cy.findArea());
		System.out.println("圆柱体积为：" + cy.findVolume());
	}
}
