package com.atguigu.java;

/**
 * @description: 例子：创建三个窗口买票，总票数为100张，使用实现Runnable接口的方式
 * 使用同步代码块解决继承Thread类的方式的线程安全问题
 * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-09-25 17:55
 * @version: v1.0
 */
class Window2 extends Thread {

    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //synchronized (obj) {//不可以换成this,this代表t1、t2、t3三个对象
            synchronized (Window2.class) {//可以换成类，因为类也是对象
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":买票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
