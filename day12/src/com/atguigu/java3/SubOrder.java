package com.atguigu.java3;

import com.atguigu.java2.Order;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月30日下午5:51:15
 */

public class SubOrder extends Order{

	public void method() {
		orderProtected = 1;
		orderPublic = 2;
		
		methodProtected();
		methodPublic();
		
		 
	}
}
