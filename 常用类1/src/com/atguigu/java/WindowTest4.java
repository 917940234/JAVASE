package com.atguigu.java;

/**
 * @description: 使用同步方法处理继承Thread类的线程安全问题
 * 关于同步方法的总结：
 * 1.同步方法仍然涉及到同步监视器，只是不需要我们显式的声明
 * 2.非静态的同步方法，同步监视器是：this
 *   静态的同步方法，同步监视器是：当前类本身
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-09-25 18:31
 * @version: v1.0
 */
class Window4 extends Thread {

    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private static synchronized void show(){//静态方法才行，非静态会生成三个
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            }  catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":买票，票号为：" + ticket);
            ticket--;
        }
    }
}

public class WindowTest4 {
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
