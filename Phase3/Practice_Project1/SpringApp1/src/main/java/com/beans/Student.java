package com.beans;

public class Student {

	private int rollno;
	private String sname;
	private String course;
	private float fees;
	
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
	public Student(int rollno, String sname, String course, float fees) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.course = course;
		this.fees = fees;
		//System.out.println("It is constructor");
	}
	
	public void printValues()
	{
		System.out.println("Roll nummber : " + this.getRollno());
		System.out.println("Student Name : " + this.getSname());
		System.out.println("Course : " + this.getCourse());
		System.out.println("Fees : " + this.getFees());		
	}
}
