package com.example.demo.Dao;


import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Record;
import com.example.demo.Entity.Borrowid;

public interface RecordDao extends JpaRepository<Record, Borrowid>{

	List<Record> findByBorrowidAndBorrowtime(Borrowid borrowid,Timestamp borrowtime);
	@SuppressWarnings("unchecked")
	Record saveAndFlush(Record record);
	void deleteByBorrowid(Borrowid borrowid);
	List<Record> findAll();
	List<Record> findByBorrowidUsersidLikeOrBorrowidBooksidLike(String usersid,String booksid);
	List<Record> findByBorrowidUsersid(String usersid);
	//Record findByBorrowidAndBorrowtimeAndFineisNull(Borrowid borrowid,Timestamp borrowtime);
	List<Record> findByReturntimeIsNull();
	void deleteByBorrowidUsersid(String usersid);
	void deleteByBorrowidBooksid(String booksid);
	boolean existsByBorrowid(Borrowid borrowid);
	Record findByBorrowid(Borrowid id);
}
