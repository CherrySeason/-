package com.example.demo.Service.Impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dao.RecordDao;
import com.example.demo.Entity.Borrowid;
import com.example.demo.Entity.Record;

import com.example.demo.Service.RecordService;
@Service
@Transactional
public class RecordServiceImpl implements RecordService{

	@Autowired
	private RecordDao recordDao;
	

	@Override
	public Record saveAndFlush(Record record) {
		// TODO Auto-generated method stub
		return recordDao.saveAndFlush(record);
	}

	@Override
	public List<Record> findAll() {
		// TODO Auto-generated method stub
		return recordDao.findAll();
	}

	

	@Override
	public List<Record> findByBorrowidUsersidLikeOrBorrowidBooksidLike(String usersid,String booksid) {
		// TODO Auto-generated method stub
		return recordDao.findByBorrowidUsersidLikeOrBorrowidBooksidLike("%"+usersid+"%","%"+booksid+"%");
	}

	@Override
	public List<Record> findByBorrowidUsersid(String usersid) {
		// TODO Auto-generated method stub
		return recordDao.findByBorrowidUsersid(usersid);
	}

	@Override
	public List<Record> findByReturntimeIsNull() {
		// TODO Auto-generated method stub
		return recordDao.findByReturntimeIsNull();
	}
	
	@Override
	public void deleteByBorrowidUsersid(String usersid) {
		// TODO Auto-generated method stub
		recordDao.deleteByBorrowidUsersid(usersid);
	}

	@Override
	public void deleteByBorrowidBooksid(String booksid) {
		// TODO Auto-generated method stub
		recordDao.deleteByBorrowidBooksid(booksid);
	}

	@Override
	public void deleteByBorrowid(Borrowid borrowid) {
		// TODO Auto-generated method stub
		recordDao.deleteByBorrowid(borrowid);
	}

	@Override
	public List<Record> findByBorrowidAndBorrowtime(Borrowid borrowid, Timestamp borrowtime) {
		// TODO Auto-generated method stub
		return recordDao.findByBorrowidAndBorrowtime(borrowid, borrowtime);
	}

	@Override
	public boolean existByBorrowid(Borrowid borrowid) {
		// TODO Auto-generated method stub
		return recordDao.existsByBorrowid(borrowid);
	}

	@Override
	public Record findByBorrowid(Borrowid id) {
		// TODO Auto-generated method stub
		return recordDao.findByBorrowid(id);
	}





}
