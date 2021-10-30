package com.atguigu.java;

/**
 * 
 * @Description 万事万物皆对象
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月25日上午10:29:10
 */

public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p);
		
		p.sendEmail();
		p.playGame();
		
		//匿名对象的使用(只能调用一次)
//		new Phone().sendEmail();
//		new Phone().playGame();
		
		new Phone().price = 1999;
		new Phone().showPrice();//0.0	
		
		//*******************************
		PhoneMall mall = new PhoneMall();
		//匿名对象的使用(做到了调用多次)
		mall.show(new Phone());
	}
}

class PhoneMall{	
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
	}
}

class Phone{
	double price;//价格
	
	public void sendEmail() {
		System.out.println("发送邮件");
	}
	
	public void playGame() {
		System.out.println("玩游戏");
	}
	
	public void showPrice() {
		System.out.println("手机价格为：" + price);
	}
}