package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Equipment;
import com.atguigu.team.domain.NoteBook;
import com.atguigu.team.domain.PC;
import com.atguigu.team.domain.Printer;
import com.atguigu.team.domain.Programmer;

/**
 * @Description 负责封装数据进数组
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月21日下午1:08:30
 */

public class NameListService {

	private Employee[] employees;
	
	/**
	 * 给employees及数组元素进行初始化
	 */
	public NameListService() {
		
		employees = new Employee[Data.EMPLOYEES.length];
		
		for(int i = 0;i < employees.length;i++) {

			//获取员工的类型
			int type = Integer.parseInt(Data.EMPLOYEES[i][0]);

			//获取Employee的4个基本信息
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
			Equipment equipment;
			double bonus;
			int stock;
			
			switch(type) {
			case Data.EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case Data.PROGRAMMER:
				equipment = createEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;
			case Data.DESIGNER:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				employees[i] = new Designer(id, name, age, salary, equipment, bonus);
				break;
			case Data.ARCHITECT:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;
			}
			
		}
		
	}

	/**
	 * 
	 * @Description 获取指定index上的员工的设备
	 * @author	Youcheng_Zong	
	 * @date	2021年9月21日下午2:17:57
	 * @param index
	 * @return
	 */
	
	private Equipment createEquipment(int index) {
		
		int type = Integer.parseInt(Data.EQUIPMENTS[index][0]);
		switch(type) {
		case Data.PC://21		
			return new PC(Data.EQUIPMENTS[index][1], Data.EQUIPMENTS[index][2]);
		
		case Data.NOTEBOOK://22
			return new NoteBook(Data.EQUIPMENTS[index][1], Double.parseDouble(Data.EQUIPMENTS[index][2]));
	
		case Data.PRINTER://23
			return new Printer(Data.EQUIPMENTS[index][1], Data.EQUIPMENTS[index][2]);
		}
		return null;
	}

	private void parseInt(String string) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 
	 * @Description 获取当前所有的员工。
	 * @author	Youcheng_Zong	
	 * @date	2021年9月21日下午2:46:35
	 * @return
	 */
	public Employee[] getAllEmployees() {
		return employees;
	}
	/**
	 * 
	 * @Description 获取指定ID的员工对象
	 * @author	Youcheng_Zong	
	 * @date	2021年9月21日下午2:47:11
	 * @param id
	 * @return
	 * @throws TeamException 
	 */
	public Employee getEmployee(int id) throws TeamException {
		for(int i = 0;i < employees.length;i++) {
			if(employees[i].getId() == id) {
				return employees[i];
			}
		}
		
		throw new TeamException("找不到指定的员工");
	}
}
