package com.atguigu.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @description: TODO
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-10 11:05
 * @version: v1.0
 */
public class PropertiesTest {

    //Properties:常用来处理配置文件，key和value都是String类型
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            Properties pros = new Properties();

            fis = new FileInputStream("jdbc.properties");
            pros.load(fis);//加载流对应的文件

            String name = pros.getProperty("name");
            String password = pros.getProperty("password");

            System.out.println("name = " + name + ",password = " + password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
