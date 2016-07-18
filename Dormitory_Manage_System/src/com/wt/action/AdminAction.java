package com.wt.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;
	
	public String userList() {
		
		session = ActionContext.getContext().getSession();

		return "userList";
	}
	
}
