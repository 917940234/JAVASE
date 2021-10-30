package com.atguigu.java2;

/**
 * @Description main()方法的使用说明
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月7日下午6:43:04
 */

public class MainTest {
	public static void main(String[] args) {
		
		Main.main(new String[100]);
		
	}
}

class Main{
	
	public static void main(String[] args) {

		for(int i = 0;i < args.length;i++) {
			args[i] = "args_" + i;
			System.out.println(args[i]);
		}
		
	} 
}