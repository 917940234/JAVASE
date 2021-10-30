package com.atguigu.exer1;

import java.util.List;

/**
 * @description: 创建DAO类的对象，分别调用其save、get、update、list\delete方法来操作User对象，使用Junit单元测试类进行测试
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-12 13:46
 * @version: v1.0
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<User>();

        dao.save("1001",new User(1001,34,"周杰伦"));
        dao.save("1002",new User(1002,20,"昆凌"));
        dao.save("1003",new User(1003,25,"蔡依林"));

        dao.update("1003",new User(1003,30,"方文山"));

        dao.delete("1002");

        List<User> list = dao.list();
//        System.out.println(list);
        list.forEach(System.out::println);
    }
}
