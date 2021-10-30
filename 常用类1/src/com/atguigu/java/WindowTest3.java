package com.atguigu.java;

/**
 * @description: 使用同步方法解决实现Runnable接口的线程安全问题
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-09-25 18:22
 * @version: v1.0
 */
class Window3 implements Runnable {

    private int ticket = 100;
//    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private synchronized void show() {//同步监视器：this
        if (ticket > 0) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":买票，票号为：" + ticket);

            ticket--;
        }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w = new Window3();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
