package com.wt.dao;

import java.util.List;

import com.wt.entity.Dormitory;
import com.wt.entity.Student;

public class StudentDao extends BaseDao{
	
	// ��ѯ����ѧ����Ϣ
	public List<Student> getAll() {

		// ���µ����Ϊ����������쳣���������ϲ�ѯ����
		String hql = "FROM Student s LEFT OUTER JOIN FETCH s.dormitory";

		return getSession().createQuery(hql).list();

	}

}
