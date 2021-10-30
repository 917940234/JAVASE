package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @description: 处理流之二：转换流的使用
 * 1. 转换流：属于字符流
 *    InputStreamReader：将一个字节的输入流转换为字符的输入流
 *    OutputStreamWriter：将一个字符的输出流转换为字节的输出流
 *
 * 2. 作用：提供字节流与字符流之间的转换
 *
 * 3. 解码：字节、字节数组——>字符数组、字符串
 *    编码：字符数组、字符串——>字节、字节数组
 *
 * 4. 字符集：
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-14 12:28
 * @version: v1.0
 */
public class InputStreamReaderTest {

    //此时处理异常，仍然应该使用try-catch-finally
    //InputStreamReader的使用，实现字节的输入流到字符的输入流的转换
    @Test
    public void test1() throws IOException {

        FileInputStream fis = new FileInputStream("hello.txt");
//        InputStreamReader isr = new InputStreamReader(fis);//使用系统默认的字符集
        //参数2指明了字符集，具体使用哪个字符集，取决于文件dbcp.txt保存时使用的字符集
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");

        char[] cbuf = new char[5];
        int len;
        while((len = isr.read(cbuf)) != -1) {
            String str = new String(cbuf,0,len);
            System.out.print(str);
        }
        isr.close();
    }

    /**
     * 综合使用InputStreamReader和OutputStreamWriter
     */
    @Test
    public void test2() throws IOException {

        //造文件，造流
        File file1 = new File("hello.txt");
        File file2 = new File("hello_jbk.txt");

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        //读写过程
        char[] cbuf = new char[20];
        int len;
        while((len = isr.read(cbuf)) != -1) {
            osw.write(cbuf,0,len);
        }

        //关闭资源
        isr.close();
        osw.close();
    }
}
