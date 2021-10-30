package com.atguigu.java;

/**
 * 
 * @Description 设计类(设计类的成员)
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月22日下午5:17:30
 */

//测试类
public class PersonTest {
	public static void main(String[] args) {
		
		//创建(Person)类的对象=类的实例化=实例化类
		Person p1 = new Person();
		//Scanner scanner = new Scanner(system.in);
		
		//调用对象的结构：属性、方法
		//调用属性：“对象.属性”
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		
		//调用方法：“对象.方法”
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		
		Person p2 = new Person();
		System.out.println(p2.name);//null
		System.out.println(p2.age );
		
		//将p1变量保存的对象地址值赋给p3，导致p1和p3指向了堆空间中的同一个对象实体。
		Person p3 = p1;
		System.out.println(p3.name);//Tom
		
		p3.age = 10;
		System.out.println(p1.age);//10
	}
}

class Person{
	
	//属性(Field)=成员变量=域、字段
	String name;
	int age = 1;
	boolean isMale;
	
	//方法(Method)=成员方法= 函数
	public void eat() {
		System.out.println("人可以吃饭");
	}
	
	public void sleep() {
		System.out.println("人可以睡觉");
	}
	
	public void talk(String language) {
		System.out.println("人可以说话，使用的是：" + language);
	}
}