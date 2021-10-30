package com.atguigu.java4;

/**
 * @Description 多态性
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月31日下午5:54:43
 */

public class Woman extends Person{
	
	boolean isBeauty;
	
	public void goShopping() {
		System.out.println("女人喜欢购物");
	}
	
	public void eat() {
		System.out.println("女人少吃，为了减肥");
	}
	
	public void walk() {
		System.out.println("女人窈窕的走路");
	}

}
