package com.atguigu.java;

import java.io.Serializable;

/**
 * @description: Person类需要满足如下要求方可序列化
 * 1. 需要实现接口：Serializable
 * 2. 当前类提供一个全局常量：serialVersionUID
 * 3. 除了当前Person类需要实现Serializable接口之外，还必须保证其内部所有属性也必须是可序列化的(默认情况下，基本数据类型可序列化）
 *
 * 补充：ObjectOutputStream和ObjectInputStream不能序列化static和transient修饰的成员变量
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-15 13:45
 * @version: v1.0
 */
public class Person implements Serializable {

    public static final long serialVersionUID = 214512341245L;

    private String name;
    private int age;
    private Account acct;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Account acct) {
        this.name = name;
        this.age = age;
        this.acct = acct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Account implements Serializable {

    public static final long serialVersionUID = 214512341545L;
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
