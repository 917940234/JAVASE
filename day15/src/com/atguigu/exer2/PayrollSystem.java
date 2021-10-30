package com.atguigu.exer2;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月16日下午6:51:01
 */

public class PayrollSystem {
	public static void main(String[] args) {
	
		//方式一：
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入当月的月份：");
//		int month = scanner.nextInt();
		
		//方式二：
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		
		Employee[] emps = new Employee[2];
		
		emps[0] = new SalariedEmployee("马森", 1002, new MyDate(1992, 2, 28), 10000);
		emps[1] = new HourlyEmployee("潘雨生", 2001, new MyDate(1991, 1, 6), 60, 240);
		
		for(int i = 0;i < emps.length;i++) {
			System.out.println(emps[i]);
			double salary = emps[i].earnings();
			System.out.println("月工资为：" + salary);
			
			if(month + 1 == emps[i].getBirthday().getMonth()) {
				System.out.println("生日快乐！奖励100元");
			}
		}
	}
}
