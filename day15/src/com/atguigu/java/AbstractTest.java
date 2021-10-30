package com.atguigu.java;


/**
 * @Description abstract关键字的使用
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月11日上午11:28:02
 */

public class AbstractTest {
	public static void main(String[] args) {
		
//		Person p1 = new Person();
//		p1.eat();
		
	}
}

abstract class Creature{
	public abstract void breath();
}

abstract class Person extends Creature{
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//不是抽象方法
//	public void eat() {
//		System.out.println("人吃饭");
//	}
	
	//抽象方法
	public abstract void eat();
	
	public void walk() {
		System.out.println("人走路");
	}
	
}

class Student extends Person{
	
	public Student() {
		super();
	}
	
	public Student(String name,int age) {
		super(name,age);
	}
	
	//子类重写了父类中所有的抽象方法后，方可实例化，否则此子类也是抽象类
	public void eat() {
		System.out.println("学生多吃有营养的食物");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("学生应该呼吸新鲜的没有雾霾的空气");
	}
	 
}