package com.wt.entity;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

	private long student_id; // ѧ��
	private String student_name; // ѧ������
	private Integer student_age; // ѧ������
	private String student_sex; // ѧ���Ա�
	private long student_phone; // ѧ����ϵ��ʽ
	private Integer student_classId; // ѧ���༶��

	// ���ѧ��������ʱ�䣬���ܱ��޸�
	private Date createTime;

	// ������ѧ����˫��Ķ��һ
	private Dormitory dormitory;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(long student_id, String student_name, Integer student_age, String student_sex, long student_phone,
			Integer student_classId, Date createTime, Dormitory dormitory) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_age = student_age;
		this.student_sex = student_sex;
		this.student_phone = student_phone;
		this.student_classId = student_classId;
		this.createTime = createTime;
		this.dormitory = dormitory;
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public Integer getStudent_age() {
		return student_age;
	}

	public void setStudent_age(Integer student_age) {
		this.student_age = student_age;
	}

	public String getStudent_sex() {
		return student_sex;
	}

	public void setStudent_sex(String student_sex) {
		this.student_sex = student_sex;
	}

	public long getStudent_phone() {
		return student_phone;
	}

	public void setStudent_phone(long student_phone) {
		this.student_phone = student_phone;
	}

	public Integer getStudent_classId() {
		return student_classId;
	}

	public void setStudent_classId(Integer student_classId) {
		this.student_classId = student_classId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Dormitory getDormitory() {
		return dormitory;
	}

	public void setDormitory(Dormitory dormitory) {
		this.dormitory = dormitory;
	}

}
