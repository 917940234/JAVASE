package com.atguigu.java2;

import com.atguigu.java2.Person.Dog;

/**
 * @Description 类的内部成员之五：内部类
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月19日上午10:09:31
 */

public class InnerClassTest {
	public static void main(String[] args) {
		
		//创建Dog实例（静态的成员内部类）
		Person.Dog dog = new Person.Dog();
		//创建Bird实例（非静态的成员内部类）
		//Person.Bird bird = new Person.Bird();
		Person p = new Person();
		Person.Bird bird = p.new Bird();
		
	}
}

class Person{
	
	//静态成员内部类
	static class Dog{
		
	}
	
	//非静态成员内部类
	class Bird{
		
	}
	
	public void method() {
		//局部内部类
		class AA{
			
		}
	}
	
	{
		//局部内部类
		class BB{
			
		}
	}
	
	public Person() {
		//局部内部类
		class CC{
			
		}
	}
}