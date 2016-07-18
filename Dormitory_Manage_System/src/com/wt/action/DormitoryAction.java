package com.wt.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wt.entity.Dormitory;
import com.wt.service.DormitoryService;

public class DormitoryAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private DormitoryService dormitoryService;
	
	private Integer id;

	ActionContext context = ActionContext.getContext();

	HttpServletRequest request = (HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);

	HttpSession session = request.getSession();

	public void setDormitoryService(DormitoryService dormitoryService) {
		this.dormitoryService = dormitoryService;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String dormitoryList() {

		List<Dormitory> dormitories = dormitoryService.getAll();

		// 以下为测试时使用
		for (Dormitory dormitory : dormitories) {

			System.out.println("name -- " + dormitory.getDormitory_name());
			System.out.println("address -- " + dormitory.getDormitory_address());

		}
		
		if(dormitories != null){
			Map<String, Object> mapSession = ActionContext.getContext().getSession();
			mapSession.put("dormitories", dormitories);
		}
		

		return "dormitoryList";
	}
	
	public String edit_dormitoryPage(){

		Dormitory dormitory = dormitoryService.dormitoryCheck(id);

		Integer dormitory_id = dormitory.getDormitory_id();
		String dormitory_name = dormitory.getDormitory_name();
		String dormitory_address = dormitory.getDormitory_address();
		Integer dormitory_phone = dormitory.getDormitory_phone();
		
		
		Map<String, Object> mapSession = ActionContext.getContext().getSession();
		mapSession.put("dormitory_id", dormitory_id);
		mapSession.put("dormitory_name", dormitory_name);
		mapSession.put("dormitory_address", dormitory_address);
		mapSession.put("dormitory_phone", dormitory_phone);
		
		return "edit_dormitoryPage";
	}

}
