package com.atguigu.java;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年8月26日下午12:03:51
 */

public class OrderTest {
	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderDefault = 1;
		order.orderPublic = 2;
		//出了Order类之后，私有的结构就不可以调用了
		//order.orderPrivate = 3;
		
		order.methodDefault();
		order.methodPublic();
		//出了Order类之后，私有的结构就不可以调用了
		//order.methodPrivate();
	}
}
