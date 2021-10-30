package com.atguigu.exer2;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月31日上午10:21:11
 */

public class CheckAccount extends Account{

	private double overdraft;//可透支限额
	
	public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;		
	}
	
	public double getOverdraft() {
		return overdraft;
	}

	@Override
	public void withdraw(double amount) {
		if(getBalance() >= amount) {//余额就足够消费
			//方式一
			setBalance(getBalance() - amount);
			//方式二
			super.withdraw(amount);
		}else if(overdraft >= amount - getBalance()) {
			overdraft -= (amount - getBalance());
			setBalance(0);			 
		}else {
			System.out.println("超过可透支限额！");
		}
	}
}
