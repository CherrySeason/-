package com.example.demo.Service;

import java.util.List;


import com.example.demo.Entity.Classific;

public interface ClassService {

	Classific findByClassid(String classid);
	List<Classific> findByClassnameLike(String classname);
	List<Classific> findAll();
}
