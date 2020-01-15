package com.pankaj.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBasket implements Cloneable {
	private String name;
	private Integer id;
	@Override
	protected FruitBasket clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		FruitBasket fruitCloned = (FruitBasket) super.clone();
		fruitCloned.setFruitList( new ArrayList<Fruit>(getFruitList()) );
		return fruitCloned;
	}
	public FruitBasket(String name, Integer id, List<Fruit> fruitList) {
		super();
		this.name = name;
		this.id = id;
		this.fruitList = fruitList;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the fruitList
	 */
	public List<Fruit> getFruitList() {
		return fruitList;
	}
	/**
	 * @param fruitList the fruitList to set
	 */
	public void setFruitList(List<Fruit> fruitList) {
		this.fruitList = fruitList;
	}
	private List<Fruit> fruitList;
	
	
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + ", fruitList=" + fruitList + "]";
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
	
		List<Fruit> fritList= Arrays.asList(new Fruit("Apple"),new Fruit("Mango"), new Fruit("Banana"));
		
		FruitBasket basket1= new FruitBasket("Basket", 1, fritList);
		FruitBasket clonedBasket = basket1.clone();
		System.out.println("original basket" + basket1);
		clonedBasket.getFruitList().add(new Fruit("Grapes"));
		System.out.println("clonedBasket " + clonedBasket);
		System.out.println("original basket" + basket1);
	}
	
}
