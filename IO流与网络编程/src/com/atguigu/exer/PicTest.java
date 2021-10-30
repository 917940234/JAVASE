package com.atguigu.exer;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-13 17:15
 * @version: v1.0
 */
public class PicTest {

    //图片的加密
    @Test
    public void test1() {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("图片.png");
            fos = new FileOutputStream("图片1-secret.png");

            byte[] buffer = new byte[20];
            int len;
            while ((len = fis.read(buffer)) != -1) {

                //字节数组进行修改
                //错误的
                //            for (byte b : buffer) {
                //                b = (byte) (b ^ 5);
                //            }
                //正确的
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }

                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //图片的解密
    @Test
    public void test2() {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("图片1-secret.png");
            fos = new FileOutputStream("图片4.png");

            byte[] buffer = new byte[20];
            int len;
            while ((len = fis.read(buffer)) != -1) {

                //字节数组进行修改
                //错误的
                //            for (byte b : buffer) {
                //                b = (byte) (b ^ 5);
                //            }
                //正确的
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }

                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
