package com.example.demo.Dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.User;

public interface UserDao extends JpaRepository<User, String>{

	//查找具体用户
	User findByUserid(String userid);
    //模糊查询读者
	List<User> findByUsernameLikeOrPhoneLikeOrUseridLike(String username,String phone,String userid);
	@SuppressWarnings("unchecked")
	//插入更新读者信息
	User saveAndFlush(User user);
	//删除读者信息
	void deleteByUserid(String userid);
	//显示所有读者信息
	List<User> findByIdLike(String id) ;
	boolean existsByUserid(String userid);
}
