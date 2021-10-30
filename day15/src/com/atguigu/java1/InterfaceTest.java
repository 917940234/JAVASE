package com.atguigu.java1;

/**
 * @Description 接口的使用
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月17日上午9:41:06
 */

/*
 * JDK7以前，只能定义全局常量和抽象方法
 * 全局常量：public static final，书写时可省略
 * 抽象方法：public abstract
 * JDK8，除了定义全局常量和抽象方法，还能定义静态方法、默认方法
 * 
 * Java开发中，接口通过让类去实现（implements）的方式来使用
 * 如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 * 如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类
 * 
 * Java类可以实现多个接口——>弥补了Java单继承性的局限性
 * 格式：class AA extends BB implements CC,DD,EE
 * 
 * 接口与接口之间可以继承，而且可以多继承
 * 
 * 接口的具体使用，体现多态性
 * 接口，实际上可以看作是一种规范
 */

public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
//		Flyable.MAX_SPEED = 2;
		
		Plane plane = new Plane();
		plane.fly();
	}
}

interface Flyable {
	
	//全局常量
	public static final int MAX_SPEED = 7900;//第一宇宙速度
	int MIN_SPEED = 1;//省略public static final
	
	//抽象方法
	public abstract void fly();	
	void stop();//省略public abstract
	
}

interface Attackable {
	
	void attack();
	
}

class Plane implements Flyable {

	@Override
	public void fly() {
		System.out.println("通过引擎起飞");
	}

	@Override
	public void stop() {
		System.out.println("驾驶员减速停止");
	}
	
}

abstract class Kite implements Flyable {

	@Override
	public void fly() {
		
	}
	
}

class Bullet extends Object implements Flyable,Attackable,CC{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}

interface AA{
	void method1();
}

interface BB{
	void method2();	
}

interface CC extends AA,BB{
	
}
