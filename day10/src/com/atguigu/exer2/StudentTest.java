package com.atguigu.exer2;

/**
 * @Description	构造器习题
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年8月26日下午12:47:00
 */

public class StudentTest {
	public static void main(String[] args) {
		
		Student t1 = new Student("宗有成", 22);
		System.out.println("name = " + t1.getName() + ",age = " + t1.getAge());

		Student t2 = new Student("宗有成", 22, "安徽工业大学");
		System.out.println("name = " + t2.getName() + ",age = " + t2.getAge() + ",school = " + t2.getSchool());

		Student t3 = new Student("宗有成", 22, "安徽工业大学", "自动化");
		System.out.println("name = " + t3.getName() + ",age = " + t3.getAge() + ",school = " + t3.getSchool() + ",major = " + t3.getMajor());
	}
}
 