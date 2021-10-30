package com.atguigu.java8;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年9月19日上午9:28:31
 */

public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		//1.接口中定义的静态方法，只能通过接口来调用
//		s.method1();
		CompareA.method1(); 
		//2.通过实现类的对象，可以调用接口中的默认方法
		//如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法
		s.method2();
		//3.如果子类或实现类继承的父类和实现的接口中声明了同名同参数的方法，
		//那么子类在没有重写此方法的情况下，默认调用的父类中的同名同参数的方法。——>类优先原则
		//4.如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，
		//那么在实现类没有重写此方法的情况下报错。——>接口冲突
		//这就需要我们必须在实现类中重写此方法
		s.method3();
		
	}
}

class SubClass extends SuperClass implements CompareA,CompareB{

	public void method2() {
		System.out.println("SubClass：上海");
	}
	
	public void method3() {
		System.out.println("SubClass：深圳");
	}
	
	public void myMethod() {
		//5.如何在子类或实现类的方法中调用父类、接口中被重写的方法
		method3();//调用自己定义的重写的方法
		super.method3();//调用父类中声明的方法
		CompareA.super.method3();//调用接口中的默认方法
		CompareB.super.method3();		
	}
}