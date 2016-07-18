package com.wt.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

// 宿舍实体类
public class Dormitory implements Serializable {

	private Integer dormitory_id; // 宿舍 id
	private String dormitory_name; // 宿舍名称
	private String dormitory_address; // 宿舍地址
	private Integer dormitory_phone; // 宿舍电话号码

	/**
	 * 1. 声明集合类型时，需要使用接口类型，因为 hibernate 在获取集合类型时 返回的是 Hibernate 内置的集合类型，而不是
	 * JavaSE 一个标准的集合实现 2. 需要把集合进行初始化，可以防止空指针异常
	 */
	// 宿舍与学生的双向的一对多
	private Set<Student> students = new HashSet<>();

	public Dormitory() {
		// TODO Auto-generated constructor stub
	}

	public Dormitory(Integer dormitory_id, String dormitory_name, String dormitory_address, Integer dormitory_phone,
			Set<Student> students) {
		super();
		this.dormitory_id = dormitory_id;
		this.dormitory_name = dormitory_name;
		this.dormitory_address = dormitory_address;
		this.dormitory_phone = dormitory_phone;
		this.students = students;
	}

	public Integer getDormitory_id() {
		return dormitory_id;
	}

	public void setDormitory_id(Integer dormitory_id) {
		this.dormitory_id = dormitory_id;
	}

	public String getDormitory_name() {
		return dormitory_name;
	}

	public void setDormitory_name(String dormitory_name) {
		this.dormitory_name = dormitory_name;
	}

	public String getDormitory_address() {
		return dormitory_address;
	}

	public void setDormitory_address(String dormitory_address) {
		this.dormitory_address = dormitory_address;
	}

	public Integer getDormitory_phone() {
		return dormitory_phone;
	}

	public void setDormitory_phone(Integer dormitory_phone) {
		this.dormitory_phone = dormitory_phone;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Dormitory [dormitory_id=" + dormitory_id + ", dormitory_name=" + dormitory_name + ", dormitory_address="
				+ dormitory_address + ", dormitory_phone=" + dormitory_phone + ", students=" + students + "]";
	}

}
