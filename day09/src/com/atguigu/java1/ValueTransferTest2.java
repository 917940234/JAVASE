package com.atguigu.java1;

/**
 * @Description 方法的形参的传递机制：值传递，引用数据类型
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月25日下午4:27:40
 */

public class ValueTransferTest2 {
	public static void main(String[] args) {
		
		Data data = new Data();
		
		data.m = 10;
		data.n = 20; 
		
		System.out.println("m = " + data.m + ",n = " + data.n);
		
		//交换m和n的值
		ValueTransferTest2 test = new ValueTransferTest2();
		test.swap(data);
		System.out.println("m = " + data.m + ",n = " + data.n);
	}
	
	public void swap(Data data) {
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}
}

class Data{
	
	int m;
	int n;
}