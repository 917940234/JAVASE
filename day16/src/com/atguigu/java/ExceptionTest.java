package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/**
 * @Description 异常的体系结构
 * 
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月20日上午9:38:41
 */

public class ExceptionTest {

	//********************以下是编译时异常*********************//
	@Test
	public void test7() {
		
//		File file = new File("hello.txt");
//		FileInputStream fis = new FileInputStream(file);
//		
//		int data = fis.read();
//		while(data != -1) {
//			System.out.println((char)data);
//			data = fis.read();
//		}
//		
//		fis.close();
		
	}
	
	
	
	
	
	
	
	//********************以下是运行时异常*********************//
	//NullPointerException
	@Test
	public void test1() {
		
		int[] arr = null;
		System.out.println(arr[3]);
		
//		String ste = "abc";
//		str = null;
//		System.out.println(str.charAt(0));
		
	}
	
	//IndexOutOfBoundsException
	@Test
	public void test2() {
		
		//ArrayIndexOutOfBoundsException
//		int[] arr = new int[10];
//		System.out.println(arr[10]);
		
		//StringIndexOutOfBoundsException
		String str = "abc";
		System.out.println(str.charAt(3));
		
	}
	
	//ClassCastException
	@Test
	public void test3() {
		
		Object obj = new Date();
		String str = (String)obj;
		
	}
	
	//NumberFormatException
	@Test
	public void test4() {
		
		String str = "123";
		str = "abc";
		int num = Integer.parseInt(str);
		
	}
	
	//InputMismatchException
	@Test
	public void test5() {
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		System.out.println(score);
		
		scanner.close();
		
	}
	
	//ArithmeticException
	@Test
	public void test6() {
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}
	
}
