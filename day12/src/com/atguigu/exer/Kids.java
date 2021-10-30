package com.atguigu.exer;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年8月30日上午9:40:51
 */

public class Kids extends ManKind{

	private int yearsOld;
	
	public Kids() {
	}
 
	public Kids(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public void printAge() {
		System.out.println("I am " + yearsOld + " years old.");
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}
	
	public void employeed() {
		System.out.println("Kids should study and no job.");
	}
}
