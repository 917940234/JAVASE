package com.atguigu.java;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月26日上午10:28:13
 */

public class Order {

	private int orderPrivate;
	int orderDefault;
	public int orderPublic;
	
	private void methodPrivate() {
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	
	void methodDefault() {
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	
	public void methodPublic() {
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
}
