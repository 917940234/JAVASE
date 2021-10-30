package com.atguigu.java;

/**
 * @Description 多态性测试
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月31日下午5:54:15
 */
 
public class PersonTest {

	/**
	 * @Description
	 * @author	Youcheng_Zong	
	 * @date	2021年9月1日上午11:15:05
	 * @param args
	 */
	/**
	 * @Description
	 * @author	Youcheng_Zong	
	 * @date	2021年9月1日上午11:17:43
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();
		
		//***********************************************
		System.out.println("************************************");
		//对象的多态性：父类的引用指向子类的对象
		Person p2 = new Man();
		
//		Person p3 = new Woman();
		
		//多态的使用，当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法——虚拟方法调用
		p2.eat();
		p2.walk();
		
//		p2.earnMoney();The method earnMoney() is undefined for the type Person
		
		System.out.println(p2.id);
		
		System.out.println("************************************");
		//不能调用子类所特有的方法、属性，因为编译时，p2是Person类型
//		p2.earnMoney();
//		p2.isSmoking = true;
		p2.name = "Tom";
		//有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，
		//导致编译时，只能调用父类中声明的属性和方法，子类特有的属性和方法不能调用
		//如何才能调用子类特有的属性和方法?向下强制类型转换  
		Man m1 = (Man)p2;
		m1.earnMoney();
		m1.isSmoking = true;
		
		//使用强转时，可能出现ClassCastException的异常
//		Woman w1 = (Woman)p2;
//		w1.goshopping;
		
		//instanceof:
		
		/*
		 * instanceof关键字的使用
		 * 
		 * a instanceof A:判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false。
		 * 
		 * 使用情境：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，
		 * 先进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型。
		 * 
		 * 如果a instanceof A返回true，则a instanceof B也返回true。
		 * 其中，类B是类A的父类
		 * 
		 */
		
		if(p2 instanceof Woman) {
			Woman w1 = (Woman)p2;
			w1.goShopping();
			System.out.println("**********Woman**********");
		}

		if(p2 instanceof Man) {
			Man m2 = (Man)p2;
			m2.earnMoney();
			System.out.println("**********Man**********");
		}
		
		if(p2 instanceof Person) {
			System.out.println("**********Person**********");
		}
		
		if(p2 instanceof Object) {
			System.out.println("**********Object**********");
		}		
		
		//练习：
		//问题一：编译时通过，运行时不通过
//		Person p3 = new Woman();
//		Man m3 = (Man)p3;
		
//		Person p4 = new Person();
//		Man m4 = (Man)p4;
		
		//问题二：编译时通过，运行时也通过
//		Object obj = new Woman();
//		Person p = (Person)obj;
		
		//问题三：编译不通过
//		Man m5 = new Woman();
//		String str = new Date();
		
	}
}
