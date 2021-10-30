package com.atguigu.java;

/**
 * @Description 模版方法的设计模式
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年9月16日下午5:38:44
 */

public class TempleteTest {
	public static void main(String[] args) {
		
		SubTemplate t = new SubTemplate();
		
		t.spendTime();
	}
}

abstract class Template{
	
	//计算某段代码执行所需要花费的时间
	public void spendTime() {
		
		long start = System.currentTimeMillis();
		
		code();//不确定的部分、易变的部分
		
		long end = System.currentTimeMillis();
		
		System.out.println("花费的时间为：" + (end - start));
	}
	
	public abstract void code();
	
}

class SubTemplate extends Template{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		
		for(int i = 2;i <= 1000;i++) {
			boolean isFlag = true;
			
			for(int j = 2;j <= Math.sqrt(i);j++) {
				
				if(i % j == 0) {
					isFlag = false;
					break;
				}
				if(isFlag) {
					System.out.println(i);
				}
				
			}
			
		}
		
	}
	
}