package com.example.demo.Entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import javax.persistence.Column;

@Embeddable
public class Borrowid implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3538934011593292050L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	@Column(name = "booksid")
	private String booksid;
	@Column(name = "usersid")
	private String usersid;
	
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
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Borrowid)) return false;

        Borrowid book = (Borrowid) o;

        if (booksid != null ? !booksid.equals(book.booksid) : book.booksid != null) return false;
       // else if(borrowtime !=null? !borrowtime.equals(book.borrowtime) : book.borrowtime==null) return false;
        return usersid != null ? usersid.equals(book.usersid) : book.usersid == null;
    }

}
