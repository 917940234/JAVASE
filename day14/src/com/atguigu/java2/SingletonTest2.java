package com.atguigu.java2;

/**
 * @Description 单例设计模式-饿汉式(加载时间短，线程暂时不安全)
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月7日下午5:58:45
 */
public class SingletonTest2 {
	public static void main(String[] args) {
		
		Order order1 = Order.getInstance();
		Order order2 = Order.getInstance();
		
		System.out.println(order1 == order2);
	}
}

class Order{
	
	//1.私有化类的构造器
	private Order() {
		
	}
	
	//2.声明当前类的变量,没有初始化，此对象也必须声明为static的
	private static Order instance = null;
	
	//3.声明public、static的返回当前类对象的方法
	public static Order getInstance() {
		if(instance == null) {
			instance = new Order();
		}
		return instance;		
	}
}