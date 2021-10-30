package com.atguigu.java1;

/**
 * @Description JavaBean是一种Java语言写成的可重用组件
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年8月26日下午1:38:32
 */
public class Customer {

	private int id;
	private String name;
	
	public Customer() {
		
	}
	
	public void setId(int i) {
		id = i;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	
}
