package com.atguigu.java1;

/**
 * @Description static关键字的使用
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月6日上午10:11:41
 */

public class StaticTest {

	public static void main(String[] args) {
		
		//
		Chinese.nation = "中国";

		Chinese c1 = new Chinese();
		c1.name = "姚明";
		c1.age = 40;
		c1.nation = "CHN";
		
		Chinese c2 = new Chinese();
		c2.name = "马龙";
		c2.age = 30;
		c1.nation = "CHINA";	
		
		System.out.println(c1.nation);
	}
}

//中国人
class Chinese{
	
	String name;
	int age;
	static String nation;
	
	
}