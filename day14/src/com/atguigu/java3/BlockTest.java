package com.atguigu.java3;

/**
 * @Description 类的成员之四：代码块（或初始化块）
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年9月7日下午7:14:16
 */

public class BlockTest {
	public static void main(String[] args) {
		
		String desc = Person.desc;
		
		Person p1 = new Person();

		System.out.println(desc);
		
	}
}

class Person{
	//属性
	String name;
	int age;
	static String desc = "我是一个人";
	
	//构造器
	public Person() {
		
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//代码块
	//静态代码块：随着类的加载而执行，而且只执行一次，初始化一些类的信息
	//多个静态代码块按照声明的先后顺序执行，且在非静态代码块之前执行
	//静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构
	static{
		 System.out.println("hello,static block");
	}
	
	//非静态代码块：随着对象的创建而执行，每创建一个对象就执行一次非静态代码块 
	//可以在创建对象时，对对象的属性等进行初始化，多个非静态代码块按照声明的先后顺序执行
	//非静态代码块内可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法
	{
		 System.out.println("hello,block");
		 desc = "我是一个爱学习的人";
	}
	
	//方法
	public void eat() {
		System.out.println("吃饭");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static void info() {
		System.out.println("我是一个快乐的人！");
	}
	
	
}