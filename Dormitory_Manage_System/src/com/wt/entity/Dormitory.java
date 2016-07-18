package com.wt.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

// ����ʵ����
public class Dormitory implements Serializable {

	private Integer dormitory_id; // ���� id
	private String dormitory_name; // ��������
	private String dormitory_address; // �����ַ
	private Integer dormitory_phone; // ����绰����

	/**
	 * 1. ������������ʱ����Ҫʹ�ýӿ����ͣ���Ϊ hibernate �ڻ�ȡ��������ʱ ���ص��� Hibernate ���õļ������ͣ�������
	 * JavaSE һ����׼�ļ���ʵ�� 2. ��Ҫ�Ѽ��Ͻ��г�ʼ�������Է�ֹ��ָ���쳣
	 */
	// ������ѧ����˫���һ�Զ�
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
