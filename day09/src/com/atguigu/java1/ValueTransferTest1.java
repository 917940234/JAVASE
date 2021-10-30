package com.atguigu.java1;

/**
 * @Description 方法的形参的传递机制：值传递，基本数据类型
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月25日下午4:02:00
 */

public class ValueTransferTest1 {
	public static void main(String[] args) {
		
		int m = 10;
		int n = 20;
		System.out.println("m = " + m + ",n = " + n);
		
		//交换两个变量的值的操作
//		int temp = m;
//		m = n;
//		n = temp;
		
		ValueTransferTest1 test = new ValueTransferTest1();
		test.swap(m, n);
		
		System.out.println("m = " + m + ",n = " + n);
	}
	
	public void swap(int m,int n) {
		int temp = m;
		m = n;
		n = temp;
	}
}
