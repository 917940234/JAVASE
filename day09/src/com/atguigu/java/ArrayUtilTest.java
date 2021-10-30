package com.atguigu.java;

/**
 * 
 * @Description 自定义数组的工具类测试
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月25日上午11:22:58
 */

public class ArrayUtilTest {
	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[] {32,34,32,5,3,54,654,-98,0,-53,5};
		
		int max = util.getMax(arr);
		System.out.println("最大值为：" + max);
		
		int min = util.getMin(arr);
		System.out.println("最小值为：" + min);
		
		int sum = util.getSum(arr);
		System.out.println("总和为：" + sum);
		
		int avg = util.getAvg(arr);
		System.out.println("平均值为：" + avg);
		
		util.reverse(arr);
		util.print(arr);
		
		int[] arrCopy = util.copy(arr);
		util.print(arrCopy);
		
		util.sort(arr);;
		util.print(arr);
		
		util.getIndex(arr, 654);
	}
}
