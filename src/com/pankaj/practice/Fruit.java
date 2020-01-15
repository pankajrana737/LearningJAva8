package com.pankaj.practice;

public class Fruit {

	private String fruitName;

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public Fruit(String fruitName) {
		super();
		this.fruitName = fruitName;
	}

	@Override
	public String toString() {
		return  fruitName ;
	}
	
}
