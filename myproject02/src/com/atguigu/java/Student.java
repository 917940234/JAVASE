package com.atguigu.java;

/**
 * @Description 继承性(class A extends B{})
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月27日下午6:12:11
 */
public class Student extends Person{

//	String name;
//	int age;
	String major;

	public Student() {
		
	}
	
	public Student(String name,int age,String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
//	public void eat() {
//		System.out.println("吃饭");
//	}
//	
//	public void sleep() {
//		System.out.println("睡觉");
//	}	
	
	public void study() {
		System.out.println("学习");
	}	
}
