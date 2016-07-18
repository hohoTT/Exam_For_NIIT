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
	
	// 宿舍注册，向数据库中插入数据;
	// 宿舍修改信息，调用相同的方法
	public void saveOrUpdate(Dormitory dormitory){
		
		dormitoryDao.saveOrUpdate(dormitory);
		
	}
	
	// 宿舍注册，向数据库中插入数据;
	public void save(Dormitory dormitory){
		
		dormitoryDao.save(dormitory);
		
	}
	
	// 查找宿舍是否存在
	public Dormitory dormitoryCheck(Integer id){
		
		return dormitoryDao.dormitoryCheck(id);
		
	}
}
