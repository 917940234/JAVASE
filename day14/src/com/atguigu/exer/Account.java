package com.atguigu.exer;

/**
 * @Description static课后练习：账户信息
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月7日下午3:55:52
 */

public class Account {

	private int id;
	private String password = "000000";
	private double balance;
	
	private static double interestRate;
	private static double minMoney = 1.0;
	private static int init = 1001;//用于自动生成id使用的

	public Account() {
		id = init++;
	}
	
	public Account(String password,double balance) {
		id = init++;
		this.password = password;
		this.balance = balance;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;
	}
	public static double getMinMoney() {
		return minMoney;
	}
	public static void setMinMoney(double minMoney) {
		Account.minMoney = minMoney;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", password=" + password + ", balance=" + balance + "]";
	}
	
	
}
