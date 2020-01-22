package com.pakaj.serializable.example;

import java.io.Serializable;

public class AddressSerializabale  implements Serializable {

	
	private String addressLine1;
	private String addressLine2;
	
	private String city;
	
	private String state;
	private String country;
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public AddressSerializabale(String addressLine1, String addressLine2, String city, String state, String country) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public AddressSerializabale() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
