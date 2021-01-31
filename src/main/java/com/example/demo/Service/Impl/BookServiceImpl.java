package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dao.BookDao;
import com.example.demo.Entity.Book;
import com.example.demo.Service.BookService;
@Service
@Transactional
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;
	@Override
	public Book findByBookid(String bookid) {
		// TODO Auto-generated method stub
		
		return bookDao.findByBookid(bookid);
	}


	@Override
	public Book saveAndFlush(Book book) {
		// TODO Auto-generated method stub
		return bookDao.saveAndFlush(book);
	}

	@Override
	public void deleteByBookid(String bookid) {
		// TODO Auto-generated method stub
		bookDao.deleteByBookid(bookid);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}

	@Override
	public boolean existsByBookid(String bookid) {
		// TODO Auto-generated method stub
		return bookDao.existsByBookid(bookid);
	}

	
	@Override
	public List<Book> findByBooknameLikeOrAuthorLikeOrPublichouseLikeOrIntroductionLikeOrBookidLike(
			String bookname, String author, String publichouse, String introduction,String bookid) {
		// TODO Auto-generated method stub
		return bookDao.findByBooknameLikeOrAuthorLikeOrPublichouseLikeOrIntroductionLikeOrBookidLike("%"+bookname+"%", "%"+author+"%", "%"+publichouse+"%", "%"+introduction+"%","%"+bookid+"%");
	}


	@Override
	public List<Book> findByBookidLike(String bookid) {
		// TODO Auto-generated method stub
		return bookDao.findByBookidLike("%"+bookid+"%");
	}

}
