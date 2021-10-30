package com.atguigu.java;

import java.util.Arrays;

public class HelloJava {

    static int num = 10;

    public static void main(String[] args) {
        System.out.println("hellojava");
        System.out.println(123);
        System.out.println("HelloJava.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("num = " + num);
    }
}
