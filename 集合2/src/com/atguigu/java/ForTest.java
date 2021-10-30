package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @description: jdk5.0新增了foreach循环，用于遍历集合、数组
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-05 11:15
 * @version: v1.0
 */
public class ForTest {

    @Test
    public void test() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        //for(集合元素的类型 局部变量 : 集合对象)
        //内部仍然调用了迭代器
        for(Object obj : coll) {
            System.out.println(obj);
        }
    }

    @Test
    public void test2() {
        int[] arr = new int []{1,2,3,4,5,6};
        //for(数组元素的类型 局部变量 : 数组对象)
        for(int i : arr) {
            System.out.println(i);
        }
    }

    @Test
    public void test3() {

        String[] arr = new String[] {"MM","MM","MM"};

        //方式一：普通for赋值
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "GG";
//        }

        //方式二：增强for循环，重新赋了个s，改变的是s的值，而非原来的数组，所以原来的数组不变
        for(String s : arr) {
            s = "GG";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
