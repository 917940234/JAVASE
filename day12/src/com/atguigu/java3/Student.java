package com.atguigu.java3;

/**
 * @Descriptionsuper 关键字的使用
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月30日下午6:00:56
 */
public class Student extends Person{

	String major;
	int id = 1002;
	
	public Student() {
		
	}
	
	public Student(String major) {
		this.major = major;
	}
	
	public Student(String name,int age,String major) {
		super(name, age);
		this.major = major;
	}
	
	public void eat() {
		System.out.println("学生，多吃有营养的食物");
	}
	
	public void study() {
		System.out.println("学生，学习知识");
		this.eat();
		super.eat();
	}
	
	public void show() {
		System.out.println("name = " + name + ",age = " + age);
		System.out.println("id = " +  id);
		System.out.println("id = " + super.id);
	}
}
