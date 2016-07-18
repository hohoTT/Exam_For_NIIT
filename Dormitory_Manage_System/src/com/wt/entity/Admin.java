package com.wt.entity;

import java.io.Serializable;
import java.util.Date;

// 管理员实体类
public class Admin implements Serializable {

	private Integer admin_id;			// 管理员id
	private String admin_name;			// 管理员名称
	private String admin_password;		// 管理员密码
	
	private Date createTime;			// 管理员创建日期
	
	public Integer getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Admin() {
	}

	public Admin(String admin_name, String admin_password, Date createTime) {
		super();
		this.admin_name = admin_name;
		this.admin_password = admin_password;
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Admin [admin_name=" + admin_name + ", admin_password="
				+ admin_password + ", createTime=" + createTime + "]";
	}

}
