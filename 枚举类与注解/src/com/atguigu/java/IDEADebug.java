package com.atguigu.java;

import org.junit.Test;

/**
 * @description: TODO
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-02 16:45
 * @version: v1.0
 */
public class IDEADebug {
    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());

        System.out.println(sb);
        
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }
}
