package com.atguigu.java1;

import org.junit.Test;

import java.util.List;

/**
 * @description: TODO
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-11 11:08
 * @version: v1.0
 */
public class DAOTest {

    @Test
    public void test1() {
        CustomerDAO dao1 = new CustomerDAO();

        dao1.add(new Customer());
        List<Customer> forList = dao1.getForList(10);

        StudentDAO dao2 = new StudentDAO();
        Student student = dao2.getIndex(1);
    }
}
