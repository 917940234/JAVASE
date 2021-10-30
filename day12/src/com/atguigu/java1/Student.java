package com.atguigu.java1;

/**
 * @Description 方法的重写
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月30日上午10:56:45
 */
public class Student extends Person{

	String major;
	
	public Student() {
	
	}

	public Student(String major) {
		this.major = major;
	}
	
	public void study() {
		System.out.println("学习，专业是：" + major);
	}
	
	//对父类中的eat方法进行了重写
	public void eat() {
		System.out.println("学生要多吃有营养的食物");
	}
}
