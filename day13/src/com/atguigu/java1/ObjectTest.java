package com.atguigu.java1;

/**
 * @Description 
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月1日下午2:21:24
 */

public class ObjectTest {

	public static void main(String[] args) {
		Order order = new Order();
		System.out.println(order.getClass().getSuperclass());
	}
}

class Order{
	
}
