package com.atguigu.exer2;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月16日下午6:20:28
 */

public class SalariedEmployee extends Employee{

	private double monthlySalary;//月工资
	
	public SalariedEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
	}

	public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}

	public String toString() {
		return "SalariedEmployee[" + super.toString() + "]";
	}
}
