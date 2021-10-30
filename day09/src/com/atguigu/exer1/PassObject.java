package com.atguigu.exer1;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月25日下午6:20:36
 */

public class PassObject {
	
	public static void main(String[] args) {
		PassObject test = new PassObject();
		
		Circle c = new Circle();
		
		test.printAreas(c, 5);
		
		System.out.println("now radius is " + c.radius);
	}
	
	public void printAreas(Circle c,int time){
		
		System.out.println("Radius\t\tArea");
		
		//设置圆的半径
		for(int i = 1;i <=time;i++) {
			c.radius = i;
			System.out.println(c.radius + "\t\t" + c.findArea());
		}
		
		c.radius = time + 1;
	}
}
