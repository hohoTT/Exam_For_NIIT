package com.wt.jsonHandle;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.wt.entity.Dormitory;
import com.wt.service.DormitoryService;

public class EditDormitoryJsonHandle extends ActionSupport implements ModelDriven<Dormitory>, Preparable {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> dataMap;

	private Dormitory model;
	
	private Integer id;

	private DormitoryService dormitoryService;

	public void setDormitoryService(DormitoryService dormitoryService) {
		this.dormitoryService = dormitoryService;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	// 编辑宿舍信息
	public String edit_dormitory() {

		dataMap = new HashMap<String, Object>();

		ActionContext context = ActionContext.getContext();

		HttpServletRequest request = (HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);

		HttpSession session = request.getSession();

		String dormitory_id = request.getParameter("dormitory_id");
		String dormitory_name = request.getParameter("dormitory_name");
		String dormitory_address = request.getParameter("dormitory_address");
		String dormitory_phone = request.getParameter("dormitory_phone");
		System.out.println("4444dormitory_id --- " + dormitory_id + " dormitory_name --- " + dormitory_name
				+ " dormitory_address --- " + dormitory_address + "dormitory_phone ---" + dormitory_phone);

		if (dormitory_id != null && dormitory_name != null && dormitory_address != null && dormitory_phone != null) {
			System.out.println("dormitory_id --- " + dormitory_id + " dormitory_name --- " + dormitory_name
					+ " dormitory_address --- " + dormitory_address + "dormitory_phone ---" + dormitory_phone);

			Dormitory dormitory = dormitoryService.dormitoryCheck(Integer.parseInt(dormitory_id));

			dormitory.setDormitory_id(Integer.parseInt(dormitory_id));
			dormitory.setDormitory_name(dormitory_name);
			dormitory.setDormitory_address(dormitory_address);
			dormitory.setDormitory_phone(Integer.parseInt(dormitory_phone));

			dormitoryService.saveOrUpdate(dormitory);

			dataMap.put("dormitory", model);
			dataMap.put("code", 0);
		} else {
			dataMap.put("data", "信息错误");
			dataMap.put("code", 1);
		}

		return SUCCESS;
	}

	@Override
	public void prepare() throws Exception {
	}

	@Override
	public Dormitory getModel() {
		return model;
	}

}
