package com.atguigu.java8;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月19日上午9:25:42
 */

public interface CompareA {

	//静态方法
	public static void method1() {
		System.out.println("CompareA：北京");
	}
	
	//默认方法
	public default void method2() {
		System.out.println("CompareA：上海");
	}
	
	default void method3() {
		System.out.println("CompareA：上海");
	}
	
}
