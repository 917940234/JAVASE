package com.atguigu.java2;

import java.sql.Date;

import org.junit.Test;

/**
 * @Description Java中的JUnit单元测试
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月2日下午2:19:24
 */

public class JUnitTest {

	int num = 10;
	
	@Test
	public void testEquals() {
		 String s1 = "MM";
		 String s2 = "MM";
		 System.out.println(s1.equals(s2));
		 //ClassCastException的异常
//		 Object obj = new String("GG");
//		 Date date = (Date)obj;
		 
		 System.out.println(num);
		 show();
	}
	
	public void show() {
		num = 20;
		System.out.println("show()....");
	}
	
	@Test
	public void testToString() {
		String s2 = "MM";
		System.out.println(s2.toString());
	}
} 
 