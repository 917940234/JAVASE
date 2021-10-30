package com.atguigu.java2;

/**
 * @Description 递归方法的使用（了解）
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月25日下午6:41:19
 */

public class RecursionTest {
	public static void main(String[] args) {

		//例1：计算1-n之间所有自然数之和
		//方式一
//		int sum = 0;
//		for(int i = 1;i <= 100;i++) {
//			sum += i;
//		}
	
		RecursionTest test = new RecursionTest();
		
		System.out.println(test.getSum(100));
		System.out.println(test.getSum1(10));
		System.out.println(test.getSum2(10));
		System.out.println(test.Fibonacci(10));
		
	} 
	//方式二
	public int getSum(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n + getSum(n - 1); 
		}		
	}
	
	//计算1-n之间所有自然数乘积
	public int getSum1(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n * getSum1(n - 1); 
		}		
	}
	
	public int getSum2(int n) {
		if(n == 0) {
			return 1;
		}else if(n == 1) {
			return 4;
		}else {
			return 2 * getSum2(n - 1) + getSum2(n - 2);
		}
	}
	
	//斐波那契数列
	public int Fibonacci(int n) {
		if(n == 1) {
			return 1;
		}else if(n == 2) {
			return 1;
		}else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}
	//汉诺塔问题
	//快速排序
}
 