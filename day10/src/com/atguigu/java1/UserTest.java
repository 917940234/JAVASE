package com.atguigu.java1;

/**
 * @Description 总结属性赋值的先后顺序(从先到后：默认初始化->显式初始化->构造器中赋值->通过"对象.方法"或"对象.属性"的方式赋值)
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月26日下午12:59:36
 */

public class UserTest {
	public static void main(String[] args) {

		User u = new User();
		System.out.println(u.age);

		User u1 = new User(2);
		System.out.println(u.age);

		u1.setAge(3);;
		System.out.println(u.age);
	}
}

class User{ 
	String name;
	int age = 1;
	
	public User() {
		
	}
	
	public User(int a) {
		age = a;
	}
	
	public void setAge(int a) {
		age = a;
	}
}