package com.atguigu.java;

/**
 * 
 * @Description 数组学习
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月20日上午9:53:08
 */

public class ArrayTest1 {
	public static void main(String[] args) {
		//5. 数组元素的默认初始化值(整型0; 浮点型0.0; char型0或"\u0000",而非'0';boolean型false;引用数据类型null,非"null")
		int[] arr = new int [4];
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("************");  
		
		short[] arr1 = new short [4];
		for(int i = 0;i < arr1.length;i++){
			System.out.println(arr1[i]);
		}
		System.out.println("************");		
		
		float[] arr2 = new float [4];
		for(int i = 0;i < arr2.length;i++){
			System.out.println(arr2[i]);
		}
		System.out.println("************");		

		char[] arr3 = new char [4];
		for(int i = 0;i < arr3.length;i++){
			System.out.println(arr3[i]);
		}
		System.out.println("************");		
		
		boolean[] arr4 = new boolean [4];
		for(int i = 0;i < arr4.length;i++){
			System.out.println(arr4[i]);
		}
		System.out.println("************");	
		
		String[] arr5 = new String [4];
		for(int i = 0;i < arr5.length;i++){
			System.out.println(arr5[i]);
		}
		System.out.println("************");		
	}
}
