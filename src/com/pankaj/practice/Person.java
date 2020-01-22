package com.pakaj.serializable.example;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
	private static final long serialVersionUID =112354676679334347L;
 private String name;
 private Date dob;
 private transient double age;
 private AddressSerializabale address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getAge() {
	return age;
}
public void setAge(double age) {
	this.age = age;
}
public AddressSerializabale getAddress() {
	return address;
}
public void setAddress(AddressSerializabale address) {
	this.address = address;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public Person(String name, Date dob, double age, AddressSerializabale address) {
	super();
	this.name = name;
	this.dob = dob;
	this.age = age;
	this.address = address;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
}
