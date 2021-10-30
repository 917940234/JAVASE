package com.atguigu.exer1;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月16日下午5:00:47
 */

public class Manager extends Employee{

	private double bonus;//奖金

	public Manager(double bonus) {
		super();
		this.bonus = bonus;
	}

	public Manager(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("管理员工，提高公司运行的效率");
	}
	
}
