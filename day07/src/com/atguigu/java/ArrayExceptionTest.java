package com.atguigu.java;

/**
 * 
 * @Description	数组常见异常
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月22日下午1:29:27
 */

public class ArrayExceptionTest {
	public static void main(String[] args) {
		
		//1.数组角标越界的异常：ArrayIndexOutOfBoundsExcetion
		int [] arr = new int[] {1,2,3,4,5};		
//		for(int i = 0;i <= arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(arr[-2]);
//		System.out.println("Hello!");
		
		//2.空指针异常：NullPointerException
		//情况一：
//		int[] arr1 = new int[] {1,2,3};
//		arr1 = null;//arr1本来是地址指向堆空间，现在空了，成为了空指针
//		System.out.println(arr1[0]);
		//情况二：
		int [][] arr2 = new int[4][];
		System.out.println(arr2[0][0]);
		//情况三：
		String[] arr3 = new String[] {"AA","BB","CC"};
		arr3[0] = null;
		System.out.println(arr3[0].toString());
	}
}
