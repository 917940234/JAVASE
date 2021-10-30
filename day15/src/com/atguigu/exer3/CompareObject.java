package com.atguigu.exer3;

/**
 * @Description
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月19日上午8:48:50
 */

public interface CompareObject {
	//若返回值是0，代表相等；若为正数，代表当前对象大；负数代表当前对象小
	public int compareTo(Object o);
}
