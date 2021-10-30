package com.atguigu.exer;

import org.junit.Test;

/**
 * @description: 获取一个字符串在另一个字符串中出现的次数，比如：获取“ab”在“abkkcadkabkedfkabkskab”中出现的次数
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-02 15:16
 * @version: v1.0
 */
public class StringDemo1 {
    /**
     * @param mainStr
     * @param substr
     * @return
     */
    public int getCount(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;
        int index = 0;
        if (mainLength >= subLength) {
            //方式一
//            while((index = mainStr.indexOf(subStr)) != -1){
//                count++;
//                mainStr = mainStr.substring(index + subStr.length());
//            }
            //方式二:对方式一的改进
            while ((index = mainStr.indexOf(subStr,index)) != -1) {
                count++;
                index += subLength;
            }
        }
        return count;
    }

    @Test
    public void testGetCount() {
        String mainStr = "abkkcadkabkedfkabkskab";
        String subStr = "ab";
        int count = getCount(mainStr, subStr);
        System.out.println(count);
    }
}
