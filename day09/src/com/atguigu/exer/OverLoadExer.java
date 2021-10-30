package com.atguigu.exer;

/**
 * @Description 重载习题
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月25日下午2:11:44
 */

public class OverLoadExer {
	
	//如下三个方法构成重载
	public void mOL(int i) {
		System.out.println(i * i);
	}
	
	public void mOL(int i,int j) {
		System.out.println(i * j);
	}
	
	public void mOL(String s) {
		System.out.println(s);
	}
	
	//如下三个方法构成重载
	public int max(int i,int j) {
		return (i > j)? i : j;
	}
	
	public double max(double d1,double d2) {
		return (d1 > d2)? d1 : d2;
	}
	
	public double max(double d1,double d2,double d3) {
		double max = (d1 > d2)? d1 : d2;
		return (max > d3)? max : d3;
	}

}
