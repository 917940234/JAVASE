package com.atguigu.java1;

/**
 * @Description 可变个数形参的方法
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月25日下午2:22:03
 */

public class MethodArgsTest {

	public static void main(String[] args) {
		
		MethodArgsTest test = new MethodArgsTest();
		test.show(12);
		test.show("hello");
		test.show("hello","world");
		test.show();
	
	}
	
	public void show(int i) {
		
	}
	
//	public void show(String s) {
//		System.out.println("show(String)");
//	}
	
	//可变个数形参的格式：数据类型 ... 变量名
	public void show(String ... strs) {
		System.out.println("show(String ... strs)");
	}
	
	//与本类中方法名相同，
//	public void show(String[] strs) {
//		System.out.println("show(String ... strs)");
//	}
}
