package com.atguigu.java3;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月30日下午6:09:11
 */

public class SuperTest {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.show();	
		s.study();
		
		Student s1 = new Student("Tom",21,"IT");
		s1.show(); 
		
		Student s2 = new Student();
	}
}

 