package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dao.ClassDao;
import com.example.demo.Entity.Classific;
import com.example.demo.Service.ClassService;

@Service
@Transactional
public class ClassServiceImpl implements ClassService{

	@Autowired
	private ClassDao classDao;
	@Override
	public Classific findByClassid(String classid) {
		// TODO Auto-generated method stub
		return classDao.findByClassid(classid);
	}

	@Override
	public List<Classific> findByClassnameLike(String classname) {
		// TODO Auto-generated method stub
		return classDao.findByClassnameLike(classname);
	}

	@Override
	public List<Classific> findAll() {
		// TODO Auto-generated method stub
		return classDao.findAll();
	}

}
