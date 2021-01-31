package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Book;

public interface BookDao extends JpaRepository<Book, String>{

	Book findByBookid(String bookid);
	List<Book> findAll();
	List<Book> findByBooknameLikeOrAuthorLikeOrPublichouseLikeOrIntroductionLikeOrBookidLike(String bookname,String author,String publichouse,String introduction,String bookid);
	List<Book> findByBookidLike(String bookid);
	@SuppressWarnings("unchecked")
	Book saveAndFlush(Book book);
	void deleteByBookid(String bookid);
	boolean existsByBookid(String bookid);
}
