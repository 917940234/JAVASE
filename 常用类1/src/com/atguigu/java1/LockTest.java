package com.atguigu.java1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 解决线程安全问题的方式三：Lock锁——>JDK5.0新增
 * 1.面试题：synchronized 与 lock的异同？
 *          同：二者都可以解决线程安全问题
 *          异：synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器
 *              lock需要手动的启动同步，结束同步
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-09-26 10:06
 * @version: v1.0
 */
class Window implements Runnable {

    private int ticket = 100;
    //1.实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {

            try {
                //2.调用锁定方法lock()
                lock.lock();

                if (ticket > 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
                //3.调用解锁方法unlock()
                lock.unlock();
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();

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
