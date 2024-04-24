package com.beans;

public class StdInfo {

	private int rollno;
	private String sname;
	
	private Course curs;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Course getCurs() {
		return curs;
	}

	public void setCurs(Course curs) {
		this.curs = curs;
	}
	
	public void PrintStdInfo()
	{
		System.out.println("Roll nummber : " + this.getRollno());
		System.out.println("Student Name : " + this.getSname());
		System.out.println("Course Name : " + this.getCurs().getCurname());
		System.out.println("Course Duration : " + this.getCurs().getDuration() + " Months");
	}
}
