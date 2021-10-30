package com.atguigu.java;

/**
 * @Description 面向对象特征一：封装与隐藏
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月26日上午9:22:04
 */

//四种权限（从小到大）：private、缺省(default)、protected、public
public class AnimalTest {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.name = "大黄";
		a.setAge(1);
//		a.legs = 4;
		
		a.show();
		
		a.setLegs(-6);
		a.show();
	}
}

class Animal{
	
	String name;
	private int age;
	private int legs;//腿的个数,private封装（隐藏）该属性，不让直接调用
	
	//对属性的设置
	public void setLegs(int l) {
		if(l >= 0 && l % 2 == 0) {
			legs = l;			
		}else {
			legs = 0;
			//或者抛出一个异常
		}
	}
	
	//对属性的获取
	public int getLegs() {
		return legs;
	}
	
	public void eat() {
		System.out.println("动物进食");
	}
	
	public void show() {
		System.out.println("name = " + name + ",age = " + age + ",legs" + legs);
	}
	
	//提供关于属性age的get和set方法
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}	
}