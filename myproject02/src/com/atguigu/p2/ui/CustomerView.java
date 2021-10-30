package com.atguigu.p2.ui;

import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;
import com.atguigu.p2.util.CMUtility;

/**
 * @Description CustomerView为主模块，负责菜单的显示和处理用户操作
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年8月27日下午2:09:43
 */

public class CustomerView {

	private CustomerList customerList = new CustomerList(10);

	public CustomerView() {
		Customer customer = new Customer("宗有成", '男', 22, "17855513710", "917940234@qq.com");
		customerList.addCustomer(customer);
	}
	/**
	 * 
	 * @Description 显示《客户信息管理软件》界面的方法
	 * @author	Youcheng_Zong	
	 * @date	2021年8月27日下午3:07:10
	 */
	public void enterMainMenu() {
		boolean isFlag = true;
		while(isFlag) {
			System.out.println("\n----------------客户信息管理软件----------------\n");
			System.out.println("		1 添加客户");
			System.out.println("		2 修改客户");
			System.out.println("		3 删除客户");
			System.out.println("		4 客户列表");
			System.out.println("		5 退  出\n");
			System.out.print("		请选择(1-5):");
			
			char menu = CMUtility.readMenuSelection();
			
			switch(menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.println("确认是否退出(Y/N):");
				char isExit = CMUtility.readConfirmSelection();
				if(isExit == 'Y') {
					isFlag = false;
				}
			}
		}
	}
	/**
	 * 
	 * @Description 添加客户的操作
	 * @author	Youcheng_Zong	
	 * @date	2021年8月27日下午3:05:52
	 */
	private void addNewCustomer() {
		System.out.println("\n----------------------------添加客户--------------------------------\n");
		System.out.print("姓名：");
		String name = CMUtility.readString(10);
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.print("电话：");
		String phone = CMUtility.readString(13);
		System.out.print("邮箱：");
		String email = CMUtility.readString(20);
		
		//将上述数据封装到对象中
		Customer customer = new Customer(name, gender, age, phone, email);

		boolean isSuccess = customerList.addCustomer(customer);
		
		if(isSuccess) {
			System.out.println("\n----------------------------添加完成--------------------------------\n");
		}else {
			System.out.println("\n----------------------------客户目录已满，添加失败-----------------------\n");
		}
	}
	/**
	 * 
	 * @Description 修改客户的操作
	 * @author	Youcheng_Zong	
	 * @date	2021年8月27日下午3:06:09
	 */	
	private void modifyCustomer() {
		System.out.println("\n----------------------------修改客户--------------------------------\n");
		Customer cust;
		int number;
		
		for(;;) {			
			System.out.println("请选择待修改客户的编号(-1退出)：");
			number = CMUtility.readInt();
			
			if(number == -1) {
				return;
			}
			
			cust = customerList.getCustomer(number - 1);
			
			if(cust == null) {
				System.out.println("无法找到指定的客户！");
			}else {
				break;
			}
		}
		
		//修改客户信息
		System.out.print("姓名(" + cust.getName() + "):");
		String name = CMUtility.readString(10, cust.getName());
		System.out.print("性别(" + cust.getGender() + "):");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.print("年龄(" + cust.getAge() + "):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.print("电话(" + cust.getPhone() + "):");
		String phone = CMUtility.readString(13, cust.getPhone());
		System.out.print("邮箱(" + cust.getEmail() + "):");
		String email = CMUtility.readString(30, cust.getEmail());
		
		Customer newCust = new Customer(name, gender, age, phone, email);
		
		boolean isReplaced = customerList.replaceCustomer(number - 1, newCust);
		if(isReplaced) {
			System.out.println("\n----------------------------修改完成--------------------------------\n");
		}else {
			System.out.println("\n----------------------------修改失败--------------------------------\n");
		}
		
	}
	/**
	 * 
	 * @Description 删除客户的操作
	 * @author	Youcheng_Zong 	
	 * @date	2021年8月27日下午3:06:33
	 */
	private void deleteCustomer() {
		System.out.println("\n----------------------------删除客户--------------------------------\n");
		int number;
		for(;;) {
			System.out.println("请选择待删除客户编号(-1退出)：");
			number = CMUtility.readInt();
			
			if(number == -1) {
				return;
			}
			
			Customer customer = customerList.getCustomer(number - 1);
			
			if(customer == null) {
				System.out.println("无法找到指定客户！");
			}else {
				break;
			}
		}
		
		//找到了指定的客户
		System.out.println("确认是否删除(Y/N)：");
		char isDelete = CMUtility.readConfirmSelection();
		if(isDelete == 'Y') {
			boolean deleteSuccess = customerList.deleteCustomer(number - 1);
			if(deleteSuccess) {
				System.out.println("\n----------------------------删除完成--------------------------------\n");
			}else {
				System.out.println("\n----------------------------删除失败--------------------------------\n");
			}
		}else {
			return;
		}
	}
	/**
	 * 
	 * @Description 显示客户列表的操作
	 * @author	Youcheng_Zong	
	 * @date	2021年8月27日下午3:06:33
	 */	
	private void listAllCustomers() {
		System.out.println("\n----------------------------客户列表--------------------------------\n");
		int total = customerList.getTotal();
		if(total == 0) {
			System.out.println("没有客户记录！");
		}else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = customerList.getAllCustomers();
			for(int i = 0;i < custs.length;i++) {
				System.out.println(i + 1 + "\t" + custs[i].getName() + "\t" + custs[i].getGender() + "\t" 
				+ custs[i].getAge() + "\t" + custs[i].getPhone() + "\t" + custs[i].getEmail());
			}
		}
		
		System.out.println("\n---------------------------客户列表完成------------------------------\n");
	}
	
	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
}
