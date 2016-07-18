package com.wt.service;

import java.util.List;

import com.wt.dao.DormitoryDao;
import com.wt.entity.Dormitory;

public class DormitoryService {

	private DormitoryDao dormitoryDao;

	public void setDormitoryDao(DormitoryDao dormitoryDao) {
		this.dormitoryDao = dormitoryDao;
	}

	// ��ѯ���е�������Ϣ
	public List<Dormitory> getAll() {

		return dormitoryDao.getAll();

	}

	// ����ɾ���Ĵ����߼�
	public void delete(Integer id) {
		dormitoryDao.delete(id);
	}
}
