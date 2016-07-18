package com.wt.service;

import java.util.List;

import com.wt.dao.StudentDao;
import com.wt.entity.Dormitory;
import com.wt.entity.Student;

public class StudentService {
	
	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	// 查询所有学生信息
	public List<Student> getAll() {

		return studentDao.getAll();

	}

}
