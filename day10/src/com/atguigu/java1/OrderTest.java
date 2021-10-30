package com.atguigu.java1;

import com.atguigu.java.Order;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年8月26日下午12:03:47
 */

public class OrderTest {
	public static void main(String[] args) {
		
		Order order = new Order();
		
		//出了Order类所属的包之后，缺省声明的结构就不可以调用了
		//order.orderDefault = 1;
		order.orderPublic = 2;
		//出了Order类之后，私有的结构就不可以调用了
		//order.orderPrivate = 3;
		
		//出了Order类所属的包之后，缺省声明的结构就不可以调用了
		//order.methodDefault();
		order.methodPublic();
		//出了Order类之后，私有的结构就不可以调用了
		//order.methodPrivate();
	}
}
