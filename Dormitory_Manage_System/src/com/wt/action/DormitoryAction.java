package com.wt.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wt.entity.Dormitory;
import com.wt.service.DormitoryService;

public class DormitoryAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private DormitoryService dormitoryService;
	
	public void setDormitoryService(DormitoryService dormitoryService) {
		this.dormitoryService = dormitoryService;
	}
	
	public String dormitoryList(){
		
		List<Dormitory> dormitories = dormitoryService.getAll();
		
		// 以下为测试时使用
		for (Dormitory dormitory : dormitories) {

			System.out.println("name -- " + dormitory.getDormitory_name());
			System.out.println("address -- " + dormitory.getDormitory_address());
			
		}
		
		return "dormitoryList";
	}

}
