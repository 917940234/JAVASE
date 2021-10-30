package com.atguigu.java;

/**
 * 
 * @Description 类中属性的使用
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月23日下午3:55:45
 */

public class UserTest {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.isMale);
	}
}

class User{
	//属性(或成员变量) 可加权限修饰符，如private、public、缺省、protected
	String name;
	int age;
	boolean isMale;
	
	public void talk(String language) {//language:形参，也是局部变量，调用时赋值即可
		System.out.println("我们使用" + language + "进行交流");
	}
	
	public void eat() {
		String food = "烙饼";//局部变量，不可加权限修饰符，必须赋值
		System.out.println("北方人喜欢吃：" + food);
	}
} 