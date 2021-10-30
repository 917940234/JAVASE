package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/**
 * @Description 异常的处理:抓抛模型
 * 过程一：“抛”:程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象，
 * 			 并将此对象抛出。一旦抛出对象以后，其后的代码就不再执行。
 * 
 * 		关于异常对象的产生：	①系统自动生成的异常对象
 * 						②手动生成一个异常对象，并抛出（throw）
 * 过程二：“抓”:可以理解为异常的处理方式：①try-catch-finally ②throws
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月20日上午10:19:08
 */

public class ExceptionTest1 {
/*
 * try{
 * 
 * 	可能出现异常的代码
 * 
 * }catch(异常类型1 变量名1){
 * 
 * 	处理异常的方式1
 * 
 * }catch(异常类型2 变量名2){
 * 
 * 	处理异常的方式2
 * 
 * }catch(异常类型3 变量名3){
 * 
 * 	处理异常的方式3
 * 
 * }
 * ......
 * finally{
 * 	一定会执行的代码
 * }
 * 
 * 说明：
 * 1.finally是可选的
 * 2.使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，
 * 根据此对象的类型，去catch中进行匹配
 * 3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。一旦处理完成，
 * 就跳出当前的try-catch结构（在没有写finally的情况下），继续执行其后的代码。
 * 4.catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓。
 * 5.catch中的异常类型如果满足子父类关系，则要求子类一定声明在父类的上面，否则报错。
 * 6.在try结构中声明的变量，在出了try结构以后，不能再调用。
 * 7.try-catch-finally结构可以嵌套。
 * 体会1：使用try-catch-finally处理编译时异常，是得程序在编译时就不在报错，但是运行时仍可能报错。
 * 		相当于我们使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现。
 * 体会2：开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally了。
 * 		针对于编译时异常，我们说一定要考虑异常的处理。
 */
	
	@Test
	public void test1() {
		
		String str = "123";
		str = "abc";
		
		try {
			int num = Integer.parseInt(str);			
			System.out.println("hello-1");
		}catch(NumberFormatException e) {
//			System.out.println("出现数值转换异常，不要着急……");
			//String getMessage():
			System.out.println(e.getMessage());
			//printStackTrace():
			e.printStackTrace();
		}
		
		System.out.println("hello-2");
		
	}
	
	@Test
	public void test2() {
		
		try {
			
			File file = new File("hello.txt");
			FileInputStream fis = new FileInputStream(file);
			
			int data = fis.read();
			while(data != -1) {
				System.out.println((char)data);
				data = fis.read();
			}
			
			fis.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
