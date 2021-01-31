package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.View;

public interface ViewDao extends JpaRepository<View, String>{
	List<View> findByRecordidUsersid(String usersid);
}
