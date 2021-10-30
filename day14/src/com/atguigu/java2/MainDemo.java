package com.atguigu.java2;

/**
 * @Description 
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月7日下午7:03:23
 */

public class MainDemo {
	public static void main(String[] args) {
		
		for(int i = 0;i < args.length;i++) {
			System.out.println("*****" + args[i]);
			
			int num = Integer.parseInt(args[i]);
			System.out.println("#####" + num);
		}
		
	}
}
