package com.atguigu.exer;

import org.junit.Test;

/**
 * @description: 将一个字符串进行反转，将字符串中指定部分进行反转，比如“abcdefg”反转为“abfedcg”
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-02 10:33
 * @version: v1.0
 */
public class StringDemo {
    //方式一：转换为char[]
    public String reverse(String str, int startIndex, int endIndex) {
        if (str != null && str.length() != 0) {
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    //方式二：使用String的拼接
    public String reverse1(String str, int startIndex, int endIndex) {
        if(str != null) {
            //第一部分
            String reverseStr = str.substring(0, startIndex);
            //第二部分
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }
            //第三部分
            reverseStr += str.substring(endIndex + 1);
            return reverseStr;
        }
        return null;
    }

    //方式三：使用StringBuffer/StringBuilder替换String
    public String reverse2(String str,int startIndex,int endIndex){
        if(str != null) {
            StringBuilder builder = new StringBuilder(str.length());
            //第一部分
            builder.append(str.substring(0, startIndex));
            //第二部分
            for (int i = endIndex; i >= startIndex; i--) {
                builder.append(str.charAt(i));
            }
            //第三部分
            builder.append(str.substring(endIndex + 1));
            return builder.toString();
        }
        return null;
    }

    @Test
    public void testReverse() {
        String str = "abcdefg";
        String reverse = reverse2(str,2,5);
        System.out.println(reverse);
    }
}
