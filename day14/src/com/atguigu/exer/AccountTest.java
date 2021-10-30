package com.atguigu.exer;

/**
 * @Description static课后练习：账户信息
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月7日下午3:56:12
 */

public class AccountTest {

	public static void main(String[] args) {
		
		Account acct1 = new Account();
		Account acct2 = new Account("qwerty", 2000);
		
		Account.setInterestRate(0.012);
		Account.setMinMoney(100);
		
		System.out.println(acct1);
		System.out.println(acct2);
	
		System.out.println(acct1.getInterestRate());
		System.out.println(acct1.getMinMoney());
	}
	
	
}
