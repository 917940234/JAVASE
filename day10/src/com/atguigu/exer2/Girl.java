package com.atguigu.exer2;

/**
 * @Description this习题
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月26日下午4:18:52
 */
public class Girl {

	private String name;
	private int age;	
	
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void marry(Boy boy) {
		System.out.println("我想嫁给" + boy.getName());
		boy.marry(this);
	}
	
	/**
	 * 
	 * @Description 比较两个对象的大小
	 * @author	Youcheng_Zong	
	 * @date	2021年8月26日下午4:33:35
	 * @param girl
	 * @return 正数：当前对象大；负数：当前对象小；0；当前对象与形参对象相等
	 */
	public int compare(Girl girl) {
		if(this.age > girl.age) {
			return 1;
		}else if(this.age < girl.age) {
			return -1;
		}else {
			return 0;
		}
	}
	
	public void shout() {
		if(this.age >= 22) {
			System.out.println("你可以去合法登记结婚了！");
		}else {
			System.out.println("先多谈谈恋爱~~");
		}
	}
}