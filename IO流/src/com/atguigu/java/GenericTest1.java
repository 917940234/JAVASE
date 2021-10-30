package com.atguigu.java;

import com.atguigu.exer.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * 如何自定义泛型结构：泛型类、泛型接口；泛型方法
 * 1. 关于自定义泛型类、泛型接口：
 *
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-10 17:11
 * @version: v1.0
 */
public class GenericTest1 {

    @Test
    public void test1() {

        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object类型
        //要求：如果大家定义了类是带泛型的，建议在实例化时要指明类的泛型
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");

        //建议：实例化时指明类的泛型
        Order<String> order1 = new Order<>("OrderAA",1001,"order:AA");
        order1.setOrderT("AA:hello");
    }
    
    @Test
    public void test2() {
        SubOrder sub1 = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型类型，则实例化子类对象时，不再需要指明泛型
        sub1.setOrderT(1122);

        SubOrder1<String> sub2 = new SubOrder1<>();
        sub2.setOrderT("order2...");
    }

    @Test
    public void test3() {

        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        //泛型不同的引用不能相互赋值
//        list1 = list2;

        Person p1 = null;
        Person p2 = null;
        p1 = p2;

    }

    //测试泛型方法
    @Test
    public void test4() {
        Order<String> order = new Order<>();
        Integer[] arr = new Integer[]{1,2,3,4};
        List<Integer> list = order.copyFromArrayToList(arr);

        System.out.println(list);
    }
}
