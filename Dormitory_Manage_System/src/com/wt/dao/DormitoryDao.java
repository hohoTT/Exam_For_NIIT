package com.wt.dao;

import java.util.List;

import com.wt.entity.Dormitory;

public class DormitoryDao extends BaseDao {

	// ��ѯ���е�������Ϣ
	public List<Dormitory> getAll() {

		// ���µ����Ϊ����������쳣���������ϲ�ѯ����
		String hql = "FROM Dormitory d LEFT OUTER JOIN FETCH d.students";

		return getSession().createQuery(hql).list();

	}

	// ����ɾ���Ĵ����߼�
	public void delete(Integer id) {
		
		System.out.println("id-----" + id);

		String hql = "DELETE FROM Dormitory d WHERE d.dormitory_id = ?";
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();

	}

}
