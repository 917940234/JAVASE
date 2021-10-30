package com.atguigu.java1;

/**
 * @Description	理解变量的赋值
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月25日下午3:41:05
 */

public class ValueTransferTest {
	public static void main(String[] args) {
		
		System.out.println("*************基本数据类型：*************");
		int m = 10;
		int n = m;
		System.out.println("m = " + m + ",n = " + n);
		n = 20;
		System.out.println("m = " + m + ",n = " + n);
		
		System.out.println("*************基本数据类型：*************");
		Order o1 = new Order();
		o1.orderId = 1001;
		Order o2 = o1;
		System.out.println("o1.orderId = " + o1.orderId + ",o1.orderId = " + o2.orderId);
		o2.orderId = 1002;
		System.out.println("o1.orderId = " + o1.orderId + ",o1.orderId = " + o2.orderId);		
	}
}

class Order{
	int orderId;
}
