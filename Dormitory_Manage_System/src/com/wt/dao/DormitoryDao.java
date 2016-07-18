package com.wt.dao;

import java.util.List;

import com.wt.entity.Dormitory;

public class DormitoryDao extends BaseDao {

	// 查询所有的宿舍信息
	public List<Dormitory> getAll() {

		// 以下的语句为解决懒加载异常所做的联合查询处理
		String hql = "FROM Dormitory d LEFT OUTER JOIN FETCH d.students";

		return getSession().createQuery(hql).list();

	}

	// 宿舍删除的代码逻辑
	public void delete(Integer id) {
		
		System.out.println("id-----" + id);

		String hql = "DELETE FROM Dormitory d WHERE d.dormitory_id = ?";
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();

	}

}
