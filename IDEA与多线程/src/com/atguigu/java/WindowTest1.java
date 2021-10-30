package com.atguigu.java;

/**
 * @description: 例子：创建三个窗口买票，总票数为100张，使用实现Runnable接口的方式
 * 存在线程安全问题，待解决
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-09-25 14:39
 * @version: v1.0
 */
class Window1 implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while(true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + ":买票，票号为：" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();

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
