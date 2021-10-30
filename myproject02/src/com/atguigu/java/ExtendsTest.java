package com.atguigu.java;

/**
 * @Description 继承性
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月27日下午6:15:13
 */
public class ExtendsTest {
	public static void main(String[] args) {

		Person p1 = new Person();
		p1.age = 1;
		p1.eat();
		
		Student s1 = new Student();
		s1.eat();
		s1.sleep();
	}
	
}
