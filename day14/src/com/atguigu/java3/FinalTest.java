package com.atguigu.java3;

/**
 * @Description final关键字  static final 用来修饰属性：全局常量
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月8日下午9:50:36
 */

public class FinalTest {

	final int WIDTH = 0;
	final int LEFT;
	final int RIGHT;
//	final int DOWN;
	
	{
		LEFT = 1;
	}
	
	public FinalTest() {
		RIGHT = 2;
	}
	
	public FinalTest(int n) {
		RIGHT = n;
	}
	
//	public void setDown(int down) {
//		this.DOWN = down;
//	}
	
	public void doWidth() {
//		width = 20;
	}
	
	public void show() {
		final int NUM = 10;//常量，最好大写
//		num += 20;
	}
	
	public void show(final int num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		int num = 10;
		
		num = num + 5;
		
		FinalTest test = new FinalTest();
//		test.setDown(3);
		test.show(10);
	}
}

final class FinalA{
	
}

//class B extends FinalA{
//	
//}

//class C extends String{
//	
//}

class AA{
	public final void show() {
		
	}
}

//class BB extends AA{
//	public void show() {
//		
//	}
//}
