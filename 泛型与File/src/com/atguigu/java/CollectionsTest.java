package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @description: Collections是操作Collection、Map的工具类
 * 面试题：Collection和Collections的区别？
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-10 11:22
 * @version: v1.0
 */
public class CollectionsTest {
    /**
     * reverse(List)：反转List中元素的顺序
     * shuffle(List)：对List集合元素进行随机排序
     * sort(List)：根据元素的自然顺序对指定List集合元素按升序排序
     * sort(List,Comparator)：根据指定的Comparator产生的顺序对List集合元素进行排序
     * swap(List,int,int)：将指定List集合中的i处元素和j处元素进行交换
     *
     * Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
     * Object max(Collection,Comparator)：根据Comparator指定的顺序，返回给定集合中的最大元素
     * Object min(Collection)：
     * Object min(Collection,Comparator)
     * int frequency(Collection,Object)：返回给指定集合中指定元素的出现次数
     * void copy(List dest,List src)：将src中的内容复制到dest中
     * boolean replaceAll(List list,Object oldVal,Object newVal)：使用新值替换List对应的
     */
    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(765);
        list.add(765);
        list.add(-97);
        list.add(0);

        System.out.println(list);

//        Collections.reverse(list);
//        Collections.shuffle(list);
//        Collections.sort(list);
//        Collections.swap(list,1,3);
        int frequency = Collections.frequency(list, 765);

        System.out.println(list);
        System.out.println(frequency);
    }

    //复制
    @Test
    public void test2() {
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(-97);
        list.add(0);

        //报异常：IndexOutOfBoundsException: Source does not fit in dest
//        List dest = new ArrayList();
//
//        Collections.copy(dest,list);

        //正确的
        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest.size());
        Collections.copy(dest,list);

        System.out.println(dest);

        /**
         * Collections类中提供了多个synchronizedXxx()方法，该方法可使将指定集合包装成线程同步的集合，
         * 从而可以解决多线程并发访问集合时的线程安全问题
         */

        //返回的list1即为线程安全的list
        List list1 = Collections.synchronizedList(list);
    }
}
