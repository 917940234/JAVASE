package com.atguigu.java1;

/**
 * @Description 构造器：创建对象，初始化对象的属性（信息），
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月26日上午11:52:41
 */

public class PersonTest {
	public static void main(String[] args) {
		
		//创建类的对象：new + 构造器
		Person p = new Person();
		
		Person p1 = new Person("Tom");
		System.out.println(p1.name);
		
		p.eat();
	}
}

class Person{
	//属性
	String name;
	int age;
	
	//构造器(以下三个构造器构成重载)
	public Person() {
		System.out.println("Person()......");
	}
	
	public Person(String n) {
		name = n;
	}
	
	public Person(String n,int a) {
		name = n;
		age = a;
	}
	
	//方法
	public void eat() {
		System.out.println("人吃饭");
	}
	
	public void study() {
		System.out.println("人可以学习");
	}
}