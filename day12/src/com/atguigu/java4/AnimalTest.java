package com.atguigu.java4;

import java.sql.Connection;

/**
 * @Description 多态性举例1
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月31日下午6:20:33
 */

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.func(new Dog());
		
		test.func(new Cat());
	}
	
	public void func(Animal animal) {
		animal.eat();
		animal.shout();
	}
	
	
}

class Animal{	
	public void eat() {
		System.out.println("动物，进食");
	}
	
	public void shout() {
		System.out.println("动物，叫");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("狗吃骨头");
	}
	
	public void shout() {
		System.out.println("汪！汪！汪！");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void shout() {
		System.out.println("喵！喵！喵！");
	}
}

class Order{
	public void method(Object obj) {
		
	}
}
