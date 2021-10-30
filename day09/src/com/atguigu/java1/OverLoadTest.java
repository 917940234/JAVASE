package com.atguigu.java1;

/**
 * @Description 方法的重载
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月25日下午1:36:17
 */

public class OverLoadTest {
	
	public static void main(String[] args) {
		 OverLoadTest test = new OverLoadTest();
		 test.getSum(1, 2);
	}
	
	
	//如下四个方法都构成重载
	public void getSum(int i,int j) {
		System.out.println("1");
	}
	
	public void getSum(double d1,double d2) {
		System.out.println("2");
	}
	
	public void getSum(String s,int i) {
		System.out.println("3");
	}
	
	public void getSum(int i,String s) {
		System.out.println("4");
	}
	
	//如下三个方法都不构成重载
//	public int getSum(int i,int j) {
//		return 0;
//	}
	
//	public void getSum(int m,int n) {
//		
//	}
	
//	private void getSum(int i,int j) {
//		
//	}
	
}
