package com.tek.interview.question;


/*
 * represents an order line which contains the @link Item and the quantity.
 *
 */

public class OrderLine {

	private int quantity;
	private Item item;
	
	/*
	 * constructor to initialize the item and quantity values
	 * @param item Item of the order
	 * @param quantity Quantity of the item
	 * 
	 */
	public OrderLine(Item item, int quantity) throws Exception {
		if (item == null) {
			System.err.println("ERROR - Item is NULL");
			throw new Exception("Item is NULL");
		}
        if( quantity <= 0){
        	System.err.println("ERROR - Quantity value is less than or equal to 0");
			throw new Exception("Quantity value is less than or equal to 0");
        }
        //set the item and quantity values
		this.item = item;
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	}
}
