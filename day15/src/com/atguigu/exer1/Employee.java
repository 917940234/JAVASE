package com.atguigu.exer1;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月16日下午4:58:51
 */

public abstract class Employee {

	private String name;
	private int id ;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public abstract void work();
}
