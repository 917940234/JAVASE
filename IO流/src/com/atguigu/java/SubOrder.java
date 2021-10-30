package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-10 17:18
 * @version: v1.0
 */
public class SubOrder extends Order<Integer> {//SubOrder：不是泛型类

    public static <E> List<E> copyFromArrayToList(E[] arr) {

        ArrayList<E> list = new ArrayList<>();

        for (E e : arr) {
            list.add(e);
        }
        return list;
    }
}
