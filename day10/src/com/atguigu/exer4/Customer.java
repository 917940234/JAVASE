package com.atguigu.exer4;

/**
 * @Description 银行账户练习2
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月26日下午5:26:17
 */

public class Customer {

	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String f,String l) {
		this.firstName = f;
		this.lastName = l;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
