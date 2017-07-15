package com.tek.interview.question;

import java.util.ArrayList;
import java.util.List;

/*
 * represents an order which contains the list of order lines
 *
 */
public class Order {

	private List<OrderLine> orderLines;

	//constructor for initializing the orderlines list
	public Order(){
		orderLines = new ArrayList<OrderLine>(); //ArrayList is the implementation class of List interface
	}

	/**
	 * @param orderLine of OrderLine
	 * method to add a orderLine object to the list
	 *
	 */
	public void add(OrderLine orderLine) throws Exception {
		if (orderLine == null) {
			System.err.println("ERROR - Order is NULL");
			throw new IllegalArgumentException("Order is NULL");
		}
		orderLines.add(orderLine);
	}

	/**
	 * method to get the size of the list
	 *
	 */
	public int size() {
		return orderLines.size();
	}

	/**
	 * method to get the value of a OrderLine object at the given index position in the list
	 *
	 */
	public OrderLine get(int i) {
		return orderLines.get(i);
	}

	/**
	 * method to clear the elements in the list
	 *
	 */
	public void clear() {
		this.orderLines.clear();
	}
}
