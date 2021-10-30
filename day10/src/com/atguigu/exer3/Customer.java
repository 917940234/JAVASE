package com.atguigu.exer3;

/**
 * @Description 银行账户练习
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月26日下午4:54:49
 */

public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	

}
