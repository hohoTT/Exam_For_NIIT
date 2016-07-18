package com.wt.dao;

import java.util.List;

import org.hibernate.Query;

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
	
	// ����ע�ᣬ�����ݿ��в�������;
	// �����޸���Ϣ��������ͬ�ķ���
	public void saveOrUpdate(Dormitory dormitory){
		
		getSession().saveOrUpdate(dormitory);
		
	}

	// ����ע�ᣬ�����ݿ��в�������;
	public void save(Dormitory dormitory){
		
		getSession().save(dormitory);
		
	}
	
	// ���������Ƿ����
	public Dormitory dormitoryCheck(Integer id){
		Dormitory dormitory = null;
		
		String hql = "FROM Dormitory d LEFT OUTER JOIN FETCH d.students WHERE d.dormitory_id = ?";
		
		Query query = getSession().createQuery(hql);
		
		query.setInteger(0, id);
		
		dormitory = (Dormitory) query.uniqueResult();
		
		return dormitory;
	}

}
