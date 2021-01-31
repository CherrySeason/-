package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.View;

public interface ViewService {

	List<View> findByRecordidUsersid(String usersid);
}
