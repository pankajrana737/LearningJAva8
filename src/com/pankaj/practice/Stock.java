package com.pankaj.practice;

class Stock{
	 private String name;
	 private Integer price;
	 private Integer timestamp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}
	public Stock(String name, Integer price, Integer timestamp) {
		super();
		this.name = name;
		this.price = price;
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Stock [name=" + name + ", price=" + price + ", timestamp=" + timestamp + "]";
	}
	 
	 
	 
}
