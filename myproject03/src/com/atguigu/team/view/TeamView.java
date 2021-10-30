package com.atguigu.team.view;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import com.atguigu.team.service.TeamService;

/**
 * @Description 交互界面
 * @author	Youcheng_Zong
 * @email	917940234@qq.com
 * @version	v1.0
 * @date	2021年9月22日下午5:05:35
 */

public class TeamView {
	
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();

	public void enterMainMenu() {

		boolean loopFlag = true;
		char menu = 0;
		
		while(loopFlag) {
			
			if(menu != '1') {
				listAllEmployees();			
			}
			
			System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4):");

			menu = TSUtility.readMenuSelection();
			switch(menu) {
			case '1':
				getTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.println("确认是否退出(Y/N):");
				char isExit = TSUtility.readConfirmSelection();
				if(isExit == 'Y') {
					loopFlag = false;
					System.out.println("已退出本系统");
				}
				break;
			}
		}
	}
	/**
	 * 
	 * @Description 显示所有的员工信息
	 * @author	Youcheng_Zong	
	 * @date	2021年9月22日下午5:06:46
	 */
	private void listAllEmployees() {
		System.out.println("-------------------------------开发团队调度软件----------------------------------\n");
		
		Employee[] employees = listSvc.getAllEmployees(); 
		
		System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备\n");
		
		for(int i = 0;i < employees.length;i++) {
			System.out.println(employees[i]);
		}
		
		System.out.println("\n----------------------------------------------------------------------\n");
		
	}

	private void getTeam() {
		System.out.println("-------------------------------团队成员列表------------------------------\n");
		
		Programmer[] team = teamSvc.getTeam();
		if(team == null || team.length == 0) {
			System.out.println("开发团队目前没有成员！");
		}else {
			System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\n");
			for(int i = 0;i < team.length;i++) {
				System.out.println(team[i].getDetailsForTeam());
			}
		}
		
		System.out.println("\n-----------------------------------------------------------------------------\n");
	}

	private void addMember() {
		System.out.println("----------------------------------添加成员-------------------------------------\n");
		System.out.println("请输入要添加的员工ID：");
		int id = TSUtility.readInt();
		
		try {
			Employee emp = listSvc.getEmployee(id);
			teamSvc.addMember(emp);
			System.out.println("添加成功");
		} catch (TeamException e) {
			System.out.println("添加失败，原因：" + e.getMessage());
		}
		
		TSUtility.readReturn();
	}

	private void  deleteMember() {
		System.out.println("----------------------------------删除成员-------------------------------------\n");
		System.out.println("请输入要删除的员工ID：");
		int memberid = TSUtility.readInt();
		
		System.out.println("确认是否删除(Y/N):");
		char isDelete = TSUtility.readConfirmSelection();
		if(isDelete == 'N') {
			return;
		}
		
		try {
			teamSvc.removeMember(memberid);
			System.out.println("删除成功");
		} catch (TeamException e) {
			System.out.println("删除失败，原因：" + e.getMessage());
		}
		
		TSUtility.readReturn();
	}

	public static void main(String[] args) {
		TeamView  view = new TeamView();
		view.enterMainMenu();
	}
}
