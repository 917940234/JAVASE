package com.atguigu.exer;

/**
 * 
 * @Description 数组练习
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月21日下午2:09:15
 */

public class ArrayExer2 {
	public static void main(String[] args) {
		int[] array1,array2;
		
		array1 = new int[] {2,3,4,5,11,13,17,19};
		
		//显示array1的内容
		for(int i = 0;i < array1.length;i++) {
			System.out.print(array1[i] + "\t");
		}
		
		/*
		 * //赋值array2变量等于array1 
		 * //不能称作数组的复制，都指向堆空间中唯一的实体 
		 * array2 = array1;
		 */
		
		//数组复制
		array2 = new int[array1.length];
		for(int i = 0;i < array2.length;i++) {
			array2[i] = array1[i];
		}				
		
		//修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)
		for(int i = 0;i < array2.length;i++) {
			if(i % 2 == 0) {
				array2[i] = i;
			}
		}
		System.out.println();
		
		//打印出array1
		for(int i = 0;i < array1.length;i++) {
			System.out.print(array1[i] + "\t");
		}		
		
	}
}
