package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @description: 测试FileInputStream和FileOutputStream的使用
 * 结论：1. 对于文本文件(.txt,.java,.c,.cpp)，使用字符流处理
 *      2. 对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt,...)，使用字节流处理
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-13 15:17
 * @version: v1.0
 */
public class FileInputOutputStreamTest {

    //使用字节流FileInputStream处理文本文件，可能出现乱码
    @Test
    public void testFileInputStream() {
        FileInputStream fis = null;

        try {
            //1. 造文件
            File file = new File("hello.txt");

            //2. 造流
            fis = new FileInputStream(file);

            //3. 读数据
            byte[] buffer = new byte[21];
            int len;//记录每次读取的字节的个数
            while((len = fis.read(buffer)) != -1) {
                String str = new String(buffer,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //实现对图片的复制操作
    @Test
    public void testFileInputOutputStream() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //
            File srcFile = new File("图片.png");
            File destFile = new File("图片2.png");

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制的过程
            byte[] buffer = new byte[5];
            int len;
            while((len = fis.read(buffer)) != -1) {
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //指定路径下文件的复制
    public void copyFile(String srcPath,String destPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制的过程
            byte[] buffer = new byte[1024];
            //65536缓冲：78ms
            //32768缓冲：93ms
            //16384缓冲：147ms
            //8192缓冲：152ms
            //4096缓冲：344ms
            //2048缓冲：463ms
            //1024缓冲：747ms
            //5缓冲：99377ms
            int len;
            while((len = fis.read(buffer)) != -1) {
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testCopyFile() {

        long start = System.currentTimeMillis();

        String srcPath = "01-尚硅谷-Java语言基础-资料文件结构1.avi";
        String destPath = "01-尚硅谷-Java语言基础-资料文件结构1-复制.avi";

//        String srcPath = "hello.txt";
//        String destPath = "hello3.txt";

        copyFile(srcPath,destPath);

        long end = System.currentTimeMillis();

        System.out.println("复制操作花费的时间为：" + (end - start));
    }
}
