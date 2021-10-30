package com.atguigu.java1;

/**
 * @Description 方法的重写
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月30日上午10:53:32
 */

public class PersonTest {

	public static void main(String[] args) {

		Student s = new Student("计算机科学与技术");
		s.eat();
		s.walk(10);
		
		System.out.println("**************************");
		
		s.study();
		
		Person p1 = new Person();
		p1.eat();
	}
}
