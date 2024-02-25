package com.infogalaxy.studentAbs;

public class StudentModel {
	
	private int rollno ;
	private String sname ;
	private String mobno;
	private String prnno;
	private String email;
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setMobno(String mobno) {
	this.mobno = mobno ;
	}
	public void setPrnno(String prnno) {
		this.prnno = prnno;
	}
	public void setEmail(String email) {
		this.email = email ;
	}
		
	public int getRollno() {
		return this.rollno ;
	}
	public String getSname() {
		return this.sname ;
	}
	public String getMobno() {
		return this.mobno ;
	}
	public String getPrnno() {
		return this.prnno ;
	}
	public String getEmail() {
		return this.email ;
	}
}

