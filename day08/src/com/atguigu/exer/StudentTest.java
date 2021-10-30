package com.atguigu.exer;

/**
 * @Description 对象数组题目
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月24日下午12:58:31
 */

public class StudentTest {
	public static void main(String[] args) {
		
		//声明Student类型的数组
		Student[] stus = new Student[20];
		
		for(int i = 0;i < stus.length;i++) {
			//给数组元素赋值
			stus[i] = new Student();
			//给Student对象的属性赋值
			//学号
			stus[i].number = i + 1;
			//年级
			stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
			//成绩
			stus[i].score = (int)(Math.random() * (100 - 0 + 1) + 0);
		}
		
		//遍历学生数组
		for(int i = 0;i < stus.length;i++) {
//			System.out.println("学号：" + stus[i].number + "年级：" + stus[i].state + "成绩：" + stus[i].score);
			System.out.println(stus[i].info());
		}
		
		System.out.println("***********************");
		
		//问题一：打印出3年级的学生信息
		for(int i = 0;i < stus.length;i++) {
			if(stus[i].state ==3) {
				System.out.println(stus[i].info());
			}
		}
	
		System.out.println("***********************");
		
		//问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
		for(int i = 0;i < stus.length - 1;i++) {
			for(int j = 0;j < stus.length - 1 - i;j++) {
				if(stus[j].score > stus[j + 1].score) {
					//如果需要换序，交换的是数组的元素：Student对象
					Student temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;
				}
			}
		}
		
		//遍历学生数组
		for(int i = 0;i < stus.length;i++) {
			System.out.println(stus[i].info());
		}	
		
	}
}

class Student{
	int number;//学号
	int state;//年级
	int score;//成绩
	
	//显示学生信息的方法
	public String info() {
		return "学号：" + number + ",年级：" + state + ",成绩：" + score;
	}
}
