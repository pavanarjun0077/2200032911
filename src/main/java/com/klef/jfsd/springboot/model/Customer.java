package com.klef.jfsd.springboot.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity

public class Customer
{
	@Id
  private int cid;
  private String name;
  private String address;
  private String phno;
  private String dob;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
}
