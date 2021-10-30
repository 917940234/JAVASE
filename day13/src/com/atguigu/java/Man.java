package com.atguigu.java;

/**
 * @Description 多态性
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月31日下午5:54:29
 */

public class Man extends Person{

	boolean isSmoking;
	
	int id = 1002;
	
	public void earnMoney() {
		System.out.println("男人负责挣钱养家");
	}
	
	public void eat() {
		System.out.println("男人多吃肉，长肌肉");
	}
	
	public void walk() {
		System.out.println("男人霸气的走路");
	}
	
}
