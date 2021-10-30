package com.atguigu.java2;

/**
 * @description: 线程通信的应用：生产者/消费者问题
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-09-26 11:18
 * @version: v1.0
 */
class Clerk {
    private int productCount = 0;

    //生产产品
    public synchronized void produceProduct() {
        if(productCount < 20){
            productCount++;
            notify();
            System.out.println(Thread.currentThread().getName() + "：开始生产第" + productCount + "个产品");
        }else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //消费产品
    public synchronized void consumeProduct() {
        if(productCount > 0){
            System.out.println(Thread.currentThread().getName() + "：开始消费第" + productCount + "个产品");
            productCount--;

            notify();
        }else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread {//生产者

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "：开始生产产品……");
        while(true){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.produceProduct();
        }
    }
}

class Consumer extends Thread {//生产者

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "：开始消费产品……");
        while(true){

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.consumeProduct();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者1");

        p1.start();
        c1.start();
    }
}
