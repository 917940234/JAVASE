package com.atguigu.java;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @description: TODO
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-15 15:06
 * @version: v1.0
 */
public class FileUtilsTest {

    public static void main(String[] args) {

        File srcFile = new File("day10\\图片.png");
        File destFile = new File("day10\\图片2.png");

        try {
            FileUtils.copyFile(srcFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
