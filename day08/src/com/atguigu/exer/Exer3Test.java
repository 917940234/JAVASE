package com.atguigu.exer;

/**
 * @Description 类测试3
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月24日上午11:31:19
 */

public class Exer3Test {
	public static void main(String[] args) {
		Exer3Test test = new Exer3Test();
		
		//3.1测试
//		test.method();	
		
		//3.2测试
//		System.out.println("面积为" + test.method());//同时也执行了test.method
		
		//3.3测试
		int area = test.method(12, 10);
		System.out.println("面积为" + area);//同时也执行了test.method
	}
	
	//3.1
//	public void method() {
//		for(int i = 0;i < 10;i++) {
//			for(int j = 0;j < 8;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
	
	//3.2
//	public int method() {
//		for(int i = 0;i < 10;i++) {
//			for(int j = 0;j < 8;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		return 10 * 8;
//	}
	
	//3.3
	public int method(int m,int n) {
		for(int i = 0;i < m;i++) {
			for(int j = 0;j < n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		return m * n;
	}
}
