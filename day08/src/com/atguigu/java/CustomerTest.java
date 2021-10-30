package com.atguigu.java;

/**
 * 
 * @Description 类中方法的声明和使用
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月23日下午9:39:19
 */

public class CustomerTest {
	public static void main(String[] args) {
		Customer cust1 = new Customer("null", 0);		
		cust1.eat();	

//		测试形参是否需要设置
//		int[] arr = new int [] {3,4,5,2,5,6,3,2,5};
//		cust1.sort(arr);
		
		cust1.sleep(8);
	}
}

//客户类
class Customer{
	
	//属性
	String name;
	int age;
	boolean isMale;

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//方法
	//格式：	权限修饰符 返回值类型 方法名（形参列表）｛
	//			方法体
	//		｝
	public void eat() {
		System.out.println("客户吃饭");
	}
	
	public void sleep(int hour) {
		System.out.println("休息了" + hour + "个小时");
		
		eat();
	}
	
	public String getName() {
		return name;
	}
	
	public String getNation(String nation) {
		String info = "我的国籍是：" + nation;
		return info;
	}
	
	public void sort(int[] arr) {
		
	}
}