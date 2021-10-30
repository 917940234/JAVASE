package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

/**
 * @Description CustomerList为Customer对象的管理模块，
 * 内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，
 * 供CustomerView调用
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月27日下午2:07:08
 */

public class CustomerList {

	private Customer[] customers;
	private int total = 0;
	/**
	 * 用来初始化Customer数组的构造器
	 * @param totalCustomer：指定数组的长度
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	/**
	 * 
	 * @Description 将指定的客户添加到数组中
	 * @author	Youcheng_Zong	
	 * @date	2021年8月27日下午2:33:39
	 * @param customer
	 * @return true:添加成功 false：添加失败
	 */
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length) {
			return false;
		}
		customers[total++] = customer;
		return true;
	}
	/**
	 * 
	 * @Description 修改指定索引位置的客户信息
	 * @author	Youcheng_Zong	
	 * @date	2021年8月27日下午2:37:47
	 * @param index
	 * @param cust
	 * @return true：修改成功 false：修改失败
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if(index < 0 || index >= total) {
			return false;
		}
		customers[index] = cust;
		return true;
	}
	/**
	 * 
	 * @Description 删除指定索引位置上的客户
	 * @author	Youcheng_Zong	
	 * @date	2021年8月27日下午2:47:37
	 * @param index
	 * @return true:删除成功 false:删除失败
	 */
	public boolean deleteCustomer(int index) {
		if(index < 0 || index >= total) {
			return false;
		}
		for(int i = index;i < total - 1;i++) {
			customers[i] = customers[i + 1];
		}
		
		//最后有数据的元素需要置空
//		customers[total - 1] = null;
//		total --;
		//或
		customers[--total] = null;
		return true;
	}
	/**
	 * 
	 * @Description 获取所有的客户信息
	 * @author	Youcheng_Zong	
	 * @date	2021年8月27日下午2:55:21
	 * @return
	 */
	public Customer[] getAllCustomers() {
		Customer[] custs = new Customer[total];
		for(int i = 0;i < total;i++) {
			custs[i] = customers[i];
		}
		return custs;
	}
	/**
	 * 
	 * @Description 获取指定索引位置上的客户
	 * @author	Youcheng_Zong	
	 * @date	2021年8月27日下午2:58:40
	 * @param index
	 * @return 如果找到了元素，则返回；如果没有找到，则返回null
	 */
	public Customer getCustomer(int index) {
		if(index < 0 || index >= total) {
			return null;
		}
		return customers[index];
	}
	/**
	 * 
	 * @Description
	 * @author	Youcheng_Zong	
	 * @date	2021年8月27日下午3:00:50
	 * @return
	 */
	public int getTotal() {
		return total;
	}
}
