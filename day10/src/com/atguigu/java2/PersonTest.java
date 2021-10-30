package com.atguigu.java2;

/**
 * @Description this关键字的使用(this.xxx表示当前或当前正在创建的对象的xxx)
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月26日下午3:03:23
 */
public class PersonTest {
	public static void main(String[] args) {
		 
		Person p1 = new Person();
		
		p1.setAge(10);
		System.out.println(p1.getAge()); 
		
		p1.eat();
	}
}

class Person{
	
	private String name;
	private int age;
	
	public Person() {
		this.eat();
	}
	
	public Person(String name) {
		this();
		this.name = name;
	}
	
	public Person(int age) {
		this();
		this.age = age;
	}
	
	public Person(String name,int age) {
		this(age);
		this.name = name;
//		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;//以上四个构造器中的this不能说是当前对象，应该说是当前正在创建的对象
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void eat() {
		System.out.println("人吃饭");
		study();
	}
	
	public void study() {
		System.out.println("人学习");
	}
}