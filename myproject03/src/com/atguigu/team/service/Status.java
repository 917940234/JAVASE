package com.atguigu.team.service;

/**
 * @Description 表示员工的状态
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	
 * @date	2021年9月21日下午12:48:45
 */

public class Status {
	
	private final String NAME;
	
	private Status(String name) {
		this.NAME = name;
	}

	public static final Status FREE = new Status("FREE");
	public static final Status BUSY = new Status("BUSY");
	public static final Status VOCATION = new Status("VOCATION");
	
	public String getNAME() {
		return NAME;
	}

	@Override
	public String toString() {
		return NAME;
	}
	
}
