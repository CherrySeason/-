package com.example.demo.Service.Impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.util.CastUtils;
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
	@Autowired
	private RedisService redisService;

	@Override
	public Record saveAndFlush(Record record) {
		// TODO Auto-generated method stub
		return recordDao.saveAndFlush(record);
	}

	@Override
	public List<Record> findAll() {
		// TODO Auto-generated method stub
		List<Record> records;
		String key = "records";
		Object recordCache = redisService.get(key);

		if(recordCache==null){
			records=recordDao.findAll();
			redisService.set(key,records);
		}else{
			records = castList(recordCache, Record.class);
		}
		return records;
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
	public Record findByBorrowid(Borrowid borrowid) {
		// TODO Auto-generated method stub
		return recordDao.findByBorrowid(borrowid);
	}


	//类型转换
	public static <T> List<T> castList(Object obj, Class<T> clazz)
	{
		List<T> result = new ArrayList<T>();
		if(obj instanceof List<?>)
		{
			for (Object o : (List<?>) obj)
			{
				result.add(clazz.cast(o));
			}
			return result;
		}
		return null;
	}


}
