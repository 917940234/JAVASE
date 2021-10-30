package com.atguigu.exer2;

/**
 * @Description 构造器习题
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年8月26日下午12:47:05
 */

public class Student {

	private String name;
	private int age;
	private String school;
	private String major;
	
	public Student(String n,int a) {
		name = n;
		age = a;
	}
	
	public Student(String n,int a,String s) {
		name = n;
		age = a;
		school = s;
	}
	
	public Student(String n,int a,String s,String m) {
		name = n;
		age = a;
		school = s;
		major = m;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setSchool(String s) {
		school = s;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setMajor(String m) {
		major = m;
	}
	
	public String getMajor() {
		return major;
	}	
}
