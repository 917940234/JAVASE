package com.atguigu.java;

import java.util.Arrays;

/**
 * 
 * @Description Arrays工具类
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月22日下午1:08:10
 */

public class ArraysTest {
	public static void main(String[] args) {
		
//		boolean equals(int[] a,int[] b):判断两个数组是否相等
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,3,2,4};
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
//		String toString(int[] a):输出数组信息
		System.out.println(Arrays.toString(arr1));

//		void fill(int[] a,int val):将指定值填充到数组之中
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		
//		void sort(int[] a):对数组进行排序
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

//		int binarySearch(int[] a,int key)
		int[] arr3 = new int [] {-98,-34,2,34,54,66,79,105,210,333};
		int index = Arrays.binarySearch(arr3, 210);//负数就是未找到
		if(index >=0) {
			System.out.println(index);
		}else {
			System.out.println("未找到");
		}

	}
}
