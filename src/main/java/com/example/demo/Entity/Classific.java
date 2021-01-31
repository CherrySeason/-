package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "classific")
public class Classific {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classid")
	private String classid;
    @Column(name="classname")
	private String classname;
	public String getClassid() {
		return classid;
	}
	public void setClassid(String classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
}
