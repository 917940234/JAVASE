package com.atguigu.exer2;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月31日上午10:16:00
 */

public class AccountTest {
	public static void main(String[] args) {
		Account acct = new Account(1122, 20000, 0.045); 
		
		acct.withdraw(30000);
		System.out.println("您的账户余额为：" + acct.getBalance());
		acct.withdraw(2500);
		System.out.println("您的账户余额为：" + acct.getBalance());
		acct.deposit(3000);
		System.out.println("您的账户余额为：" + acct.getBalance());
		
		System.out.println("月利率为：" + (acct.getMonthlyInterest() * 100) + "%");
	}
}
