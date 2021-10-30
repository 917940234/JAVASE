package com.atguigu.java1;

/**
 * @description: 使用同步机制将单例模式中的懒汉式改写为线程安全的
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-09-26 9:24
 * @version: v1.0
 */
public class BankTest {
}

class Bank {

    private Bank() {
    }

    private static Bank instance = null;

    public static Bank getInstance() {

        //方式一：效率稍差
//        synchronized (Bank.class) {
//            if (instance == null) {
//                instance = new Bank();
//            }
//            return instance;
//        }
        //方式二：效率更高
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
                return instance;
            }
        }
        return instance;
    }
}
