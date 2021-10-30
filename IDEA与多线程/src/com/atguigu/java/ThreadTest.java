package com.atguigu.java;

/**
 * @description: 多线程的创建，方式一：继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run()——>将此线程执行的操作声明在run()中
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用start()
 * <p>
 * 例子：遍历100以内的所有的偶数
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-09-25 11:35
 * @version: v1.0
 */

//1.创建一个继承于Thread类的子类
class MyThread extends Thread {
    //重写Thread类的run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //创建Thread类的子类的对象
        MyThread t1 = new MyThread();

        //通过此对象调用start()：①启动当前线程②调用当前线程的run()
        t1.start();
        //问题一：不能通过直接调用run()的方式启动线程
//      t1.run();
        //问题二：再启动一个线程，遍历100以内的偶数，不可以还让已经start()的线程去执行，会报异常
//      t1.start();
        MyThread t2 = new MyThread();
        t2.start();

        //如下操作仍然实在main线程中执行的
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("main" + i);
            }
        }
    }
}
