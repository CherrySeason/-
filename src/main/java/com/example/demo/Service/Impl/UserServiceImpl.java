package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dao.UserDao;
import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	//根据用户名查询读者
	@Override
	public User findByUserid(String userid) {
		// TODO Auto-generated method stub
		User user=userDao.findByUserid(userid);
		return user;
	}

	//模糊查询读者
	@Override
	public List<User> findByUsernameLikeOrPhoneLikeOrUseridLike(String username,String phone,String userid) {
		// TODO Auto-generated method stub
		return userDao.findByUsernameLikeOrPhoneLikeOrUseridLike("%"+username+"%","%"+phone+"%","%"+userid+"%");
	}

	@Override
	public User saveAndFlush(User user) {
		// TODO Auto-generated method stub
		return userDao.saveAndFlush(user);
	}

	

	@Override
	public List<User> findByIdLike(String id) {
		// TODO Auto-generated method stub
		return userDao.findByIdLike(id);
	}

	@Override
	public void deleteByUserid(String userid) {
		// TODO Auto-generated method stub
		userDao.deleteByUserid(userid);
	}

	@Override
	public boolean existsByUserid(String userid) {
		// TODO Auto-generated method stub
		return userDao.existsByUserid(userid);
	}

	
	
	
	}
