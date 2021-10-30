package com.atguigu.java1;

/**
 * @Description 方法的重写
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月30日上午10:56:47
 */
public class Person {

	String name;
	int age;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void walk(int distance) {
		System.out.println("走路，走的距离是：" + distance + "公里");
	}
}
