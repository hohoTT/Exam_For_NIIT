package com.wt.service;

import java.util.List;

import com.wt.dao.DormitoryDao;
import com.wt.entity.Dormitory;

public class DormitoryService {

	private DormitoryDao dormitoryDao;

	public void setDormitoryDao(DormitoryDao dormitoryDao) {
		this.dormitoryDao = dormitoryDao;
	}

	// 查询所有的宿舍信息
	public List<Dormitory> getAll() {

		return dormitoryDao.getAll();

	}

	// 宿舍删除的代码逻辑
	public void delete(Integer id) {
		dormitoryDao.delete(id);
	}
}
