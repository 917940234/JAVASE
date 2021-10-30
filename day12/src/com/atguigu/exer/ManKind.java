package com.atguigu.exer;

/**
 * @Description 
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月30日上午9:37:29
 */

public class ManKind {

	private int sex;//性别
	private int salary;//薪资	
	
	public ManKind() {
	}	

	public ManKind(int sex, int salary) {
		this.sex = sex;
		this.salary = salary;
	}



	public void manOrWoman() {
		if(sex == 1) {
			System.out.println("man");
		}else if(sex == 0) {
			System.out.println("woman");
		}
	}
	
	public void employeed() {
		if(salary == 0) {
			System.out.println("no job");
		}else {
			System.out.println("job");
		}
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
