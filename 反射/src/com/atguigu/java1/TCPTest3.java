package com.atguigu.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description: 实现TCP的网络编程
 * 例题3：从客户端发送文件给服务端，服务端保存到本地，并返回“发送成功”给客户端，并关闭相应的连接
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-15 18:22
 * @version: v1.0
 */
public class TCPTest3 {

    @Test
    public void client() throws IOException {

        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);

        OutputStream os = socket.getOutputStream();

        FileInputStream fis = new FileInputStream(new File("图片.png"));

        byte[] buffer = new byte[1024];
        int len;
        while((len = fis.read(buffer)) != -1) {
            os.write(buffer,0,len);
        }

        //关闭数据的输出
        socket.shutdownOutput();

        //接收来自于服务器端的数据，并显示到控制台上
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer1 = new byte[20];
        int len1;
        while((len1 = is.read(buffer1)) != -1) {
            baos.write(buffer1,0,len1);
        }
        System.out.println(baos.toString());

        fis.close();
        os.close();
        socket.close();
        baos.close();
    }

    @Test
    public void server() throws IOException {

        ServerSocket ss = new ServerSocket(9090);

        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();

        FileOutputStream fos = new FileOutputStream(new File("图片4.png"));

        byte[] buffer = new byte[1024];
        int len;
        while((len = is.read(buffer)) != -1) {
            fos.write(buffer,0,len);
        }

        System.out.println("图片传输完成");

        //服务器端给予客户端反馈
        OutputStream os = socket.getOutputStream();
        os.write("你好，照片我已收到，非常棒".getBytes());

        fos.close();
        is.close();
        socket.close();
        ss.close();
        os.close();
    }
}
