package com.atguigu.exer;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年8月26日上午11:39:18
 */

public class Person {

	private int age;
	private String name;
	
	public Person() {
		age = 18;
	}
	
	public Person(String n,int a) {
		name = n;
		age = a;
	}

	public void setAge(int a) {
		if(a < 0 || a > 130) {
			System.out.println("传入的数据非法！");
			return;
		}		
		age = a;		
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n;	
	}
	
	public String getName() {
		return name;
	}
	
	//绝对不要这样写
	public int doAge(int a) {
		age = a;
		return age;
	}
	
}
