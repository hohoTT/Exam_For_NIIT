package com.wt.dao;

import java.util.List;

import com.wt.entity.Dormitory;
import com.wt.entity.Student;

public class StudentDao extends BaseDao{
	
	// 查询所有学生信息
	public List<Student> getAll() {

		// 以下的语句为解决懒加载异常所做的联合查询处理
		String hql = "FROM Student s LEFT OUTER JOIN FETCH s.dormitory";

		return getSession().createQuery(hql).list();

	}

}
