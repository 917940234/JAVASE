package com.atguigu.java4;

/**
 * @Description 多态性测试
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月31日下午5:54:15
 */
 
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();
		
		//***********************************************
		//对象的多态性：父类的引用指向子类的对象
		Person p2 = new Man();
		
		Person p3 = new Woman();
		
		//多态的使用，当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法——虚拟方法调用
		p2.eat();
		p2.walk();
		
//		p2.earnMoney();The method earnMoney() is undefined for the type Person
		
		System.out.println(p2.id);
		
	}
}
