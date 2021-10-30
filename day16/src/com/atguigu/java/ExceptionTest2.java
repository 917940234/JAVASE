package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description 异常的处理方式二:throws + 异常模型
 * 1."throws + 异常类型"写在方法的声明处。指明此方法执行时，可能会抛出的异常类型。
 *   一旦当方法体执行时出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throws后异常类型时，
 *   就会被抛出。异常代码后续的代码就不再执行。
 * 2.体会:try-catch-finally：真正的将异常给处理掉了。
 *	 throws的方式只是将异常抛给了方法的调用者，并没有真正将异常处理掉。
 * 3.开发中如何选择使用try-catch-finally还是使用throws？
 * 	 3.1如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws，
 * 		意味着如果子类重写的方法中有异常，必须使用try-catch-finally方式处理。
 * 	 3.2执行的方法中，先后又调用了另外的几个方法，这几个方法是递进关系执行的。我们建议这几个方法使用throws方式进行处理。
 * 		而执行的方法a可以考虑用try-catch-finally方式进行处理。
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月20日下午4:42:01
 */

public class ExceptionTest2 {

	public static void main(String[] args) throws IOException{
		
		method2();
		
		
	}
	
	public static void method2() throws IOException{
		method1();
	}
	
	public static void method1() throws FileNotFoundException,IOException{
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		while(data != -1) {
			System.out.print((char)data);
			data = fis.read();
		}
		
		fis.close();	
	}
}
