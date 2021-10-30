package com.atguigu.java1;

/**
 * @Description 接口的使用
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月17日上午11:00:18
 */

public class USBTest {
	public static void main(String[] args) {
		Computer com = new Computer();
		//1.创建了接口的非匿名实现类的非匿名对象
		Flash flash = new Flash();
		com.transferData(flash);
		//2.创建了接口的非匿名实现类的匿名对象
		com.transferData(new Printer());
		//3.创建了接口的匿名实现类的非匿名对象
		USB phone = new USB() {

			@Override
			public void start() {
				System.out.println("手机开始工作");
			}

			@Override
			public void stop() {
				System.out.println("手机结束工作");
			}
			
		};
		com.transferData(phone);
		//4.创建了接口的匿名实现类的匿名对象
		com.transferData(new USB() {

			@Override
			public void start() {
				System.out.println("MP3开始工作");
			}

			@Override
			public void stop() {
				System.out.println("MP3结束工作");
			}
			
		});
	}
}

class Computer{
	
	public void transferData(USB usb) {
		usb.start();
		
		System.out.println("具体传输数据的细节");
		
		usb.stop();
	}
}

interface USB{
	//常量：定义了长宽最大最小传输速度
	
	void start();
	
	void stop();
}

class Flash implements USB{

	@Override
	public void start() {
		System.out.println("U盘开启工作");
	}

	@Override
	public void stop() {
		System.out.println("U盘结束工作");
	}
	
}

class Printer implements USB{

	@Override
	public void start() {
		System.out.println("打印机开启工作");
	}

	@Override
	public void stop() {
		System.out.println("打印机开启工作");
	}
	
}