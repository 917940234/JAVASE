package com.atguigu.exer;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月30日上午9:48:56
 */

public class KidsTest {
	public static void main(String[] args) {
		
		Kids someKid = new Kids(12);
		
		someKid.printAge();
		
		someKid.setSalary(0);
		someKid.setSex(1);
		 
		someKid.employeed();
		someKid.manOrWoman();
	}
}
