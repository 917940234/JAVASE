package com.atguigu.team.service;
/**
 * 
 * @Description 自定义异常类
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年9月21日下午2:53:15
 */
public class TeamException extends Exception{
	static final long serialVersionUID = -338751699319948L;
	
	public TeamException() {
		super();
	}
	
	public TeamException(String msg) {
		super(msg);
	}
}
