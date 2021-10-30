package com.atguigu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 面试题：区分List中remove(int index)和remove(Object obj)
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-05 18:03
 * @version: v1.0
 */
public class ListExer {

    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//
    }

    private void updateList(List list) {
//        list.remove(2);
        list.remove(new Integer(2));
    }
}
