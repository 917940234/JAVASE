package com.atguigu.exer;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年8月26日上午11:39:20
 */

public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
//		p1.setAge(12);
		System.out.println("年龄为：" + p1.getAge());
		
		Person p2 = new Person("Tom", 21);
		System.out.println("name = " + p2.getName() + ",age = " + p2.getAge());
	}
}
