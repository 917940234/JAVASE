package com.atguigu.exer3;

/**
 * @Description 银行账户练习
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月26日下午4:58:33
 */

public class CustomerTest {
	public static void main(String[] args) {
		Customer cust = new Customer("Jane", "Smith");
		
		Account acct = new Account(1000, 2000, 0.0123);
		
		cust.setAccount(acct);
		
		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(960);
		cust.getAccount().withdraw(2000);
		
		System.out.println("Customer[" + cust.getLastName() + "," + cust.getFirstName() + "] has a account:id is " + cust.getAccount().getId() + 
				",annualInterestRate is " + cust.getAccount().getAnnualInterestRate() * 100 + "%,balance is " + cust.getAccount().getBalance());
	}
}
