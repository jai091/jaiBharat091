package com.tek.interview.question;

/*
 * represents an item, contains a price and a description.
 *
 */
public class Item {

	private String description;
	private double price;

	/*
	 * constructor to initialize the item and quantity values
	 * @param description of the item 
	 * @param price of the item
	 * 
	 */
	public Item(String description, double price) {
		// Calling the Object class constructor, since it is the parent class of all objects in java - Inheritance
		super(); 
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}
}
