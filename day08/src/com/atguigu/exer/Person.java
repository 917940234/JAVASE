package com.atguigu.exer;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年8月24日上午10:48:47
 */

public class Person {
	
	String name;
	int age;
	/**
	 * sex = 1:男性 
	 * sex = 0:女性
	 */
	int sex;
	
	public void study() {
		System.out.println("studying");
	}
	
	public void showAge() {
		System.out.println("age:" + age);
	}
	
	public int addAge(int i) {
		age += i;
		return age;
	}
}
