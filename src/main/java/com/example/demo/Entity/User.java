package com.example.demo.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_table")
public class User implements Serializable {
	@Id
	@Column(name = "userid")
	private String userid;
	@Column(name = "username")
	private String username;
	@Column(name = "upassword")
	private String upassword;
	@Column(name = "phone")
	private String phone;
	@Column(name = "id")
	private String id;
	@Column(name = "iscan")
	private boolean iscan;
	@Column(name = "borrownum")
	private int borrownum;

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid=userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean getIscan() {
		return iscan;
	}
	public void setIscan(boolean iscan) {
		this.iscan = iscan;
	}
	public int getBorrownum() {
		return borrownum;
	}
	public void setBorrownum(int borrownum) {
		this.borrownum=borrownum;
	}
}
