package com.atguigu.java2;

/**
 * @Description 自定义异常
 * 如何自定义异常类？
 * 1.继承于现有的异常结构：RuntimeException
 * 2.提供全局常量：serialVersionUID
 * 3.提供重载的构造器
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月20日下午10:29:14
 */

public class MyException extends RuntimeException{

	static final long serialVersionUID = -7034897190745766939L;

	public MyException() {
		
	}
	
	public MyException(String msg) {
		super(msg);
	}
}
