package com.wt.dao;

import java.util.List;

import com.wt.entity.Dormitory;

public class DormitoryDao extends BaseDao {

	// ��ѯ���е�������Ϣ
	public List<Dormitory> getAll() {

		String hql = "FROM Dormitory";

		return getSession().createQuery(hql).list();

	}

}
