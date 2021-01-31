package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "book_table")
public class Book {

	@Id
	@Column(name = "bookid")
	private String bookid;
	@Column(name = "bookname")
	private String bookname;
	@Column(name="author",nullable=true)
	private String author;
	@Column(name = "publichouse")
	private String publichouse;
	@Column(name = "introduction",nullable=true)
	private String introduction;
	@Column(name = "isin")
	private boolean isin;
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublichouse() {
		return publichouse;
	}
	public void setPublichouse(String public_house) {
		this.publichouse = public_house;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public boolean isin() {
		return isin;
	}
	public void setin(boolean isin) {
		this.isin = isin;
	}
}
