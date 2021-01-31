package com.example.demo.Entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "recordsview")
public class View  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private Recordid recordid;
	@Column(name = "bookname")
	private String bookname;
	@Column(name = "returntime")
	private Timestamp returntime;
	@Column(name = "shouldtime")
	private Timestamp shouldtime;

	public Recordid getRecordid() {
		return recordid;
	}
    
    public void setRecordid(Recordid recordid) {
		this.recordid=recordid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Timestamp getReturntime() {
		return returntime;
	}
	public void setReturntime(Timestamp returntime) {
		this.returntime = returntime;
	}
	public Timestamp getShouldtime() {
		return shouldtime;
	}
	public void setShouldtime(Timestamp shouldtime) {
		this.shouldtime = shouldtime;
	}
}
