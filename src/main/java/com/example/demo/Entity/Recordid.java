package com.example.demo.Entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Embeddable
public class Recordid implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 75634861171557519L;
	@Column(name = "booksid")
	private String booksid;
	@Column(name = "usersid")
	private String usersid;
	@Column(name = "borrowtime")
	private Timestamp borrowtime;
	public String getBooksid() {
		return booksid;
	}
	public void setBooksid(String booksid) {
		this.booksid = booksid;
	}
	public String getUsersid() {
		return usersid;
	}
	public void setUsersid(String usersid) {
		this.usersid = usersid;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Timestamp getBorrowtime() {
		return borrowtime;
	}
	public void setBorrowtime(Timestamp borrowtime) {
		this.borrowtime = borrowtime;
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recordid)) return false;

        Recordid book = (Recordid) o;

        if (booksid != null ? !booksid.equals(book.booksid) : book.booksid != null) return false;
        return usersid != null ? usersid.equals(book.usersid) : book.usersid == null;
    }
}
