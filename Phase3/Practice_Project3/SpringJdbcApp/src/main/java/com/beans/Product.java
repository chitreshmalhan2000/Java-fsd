package com.beans;
/*
 * create table productinfo(prdid int auto_increment primary key, 
prdname varchar(30), price float, stock int);
 */
public class Product {

	private int pid;
	private String pname;
	private float price;
	private int stk;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStk() {
		return stk;
	}
	public void setStk(int stk) {
		this.stk = stk;
	}
}
