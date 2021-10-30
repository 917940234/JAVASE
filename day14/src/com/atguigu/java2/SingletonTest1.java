package com.atguigu.java2;

/**
 * @Description  单例设计模式-饿汉式(加载时间长，线程安全)
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月7日下午5:51:44
 */

public class SingletonTest1 {
	public static void main(String[] args) {
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		
		System.out.println(bank1 == bank2);
	}
}

class Bank{
	
	//1.私有化类的构造器
	private Bank() {
		
	}
	
	//2.内部创建类的对象，要求此对象也必须声明为静态的
	private static Bank instance = new Bank();
	
	//3.提供公共的静态的方法，返回类的对象
	public static Bank getInstance() {
		return instance;
	}
	
}