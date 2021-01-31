package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dao.ViewDao;
import com.example.demo.Entity.View;
import com.example.demo.Service.ViewService;

@Service
@Transactional
public class ViewServiceImpl implements ViewService{

	@Autowired
	private ViewDao viewDao;

	@Override
	public List<View> findByRecordidUsersid(String usersid) {
		// TODO Auto-generated method stub
		return viewDao.findByRecordidUsersid(usersid);
	}
	

}
