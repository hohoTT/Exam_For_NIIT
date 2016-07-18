package com.wt.dao;

import java.util.List;

import com.wt.entity.Dormitory;

public class DormitoryDao extends BaseDao {

	// 查询所有的宿舍信息
	public List<Dormitory> getAll() {

		String hql = "FROM Dormitory";

		return getSession().createQuery(hql).list();

	}

}
