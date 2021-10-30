package com.atguigu.exer;

/**
 * 
 * @Description 二维数组练习
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月21日上午10:44:40
 */

public class ArrayExer1 {
	public static void main(String[] args) {
		int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
		
		int sum = 0;//记录总和
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++)
				sum +=arr[i][j];
		}
		
		System.out.println("总和为：" + sum);
	} 
}
