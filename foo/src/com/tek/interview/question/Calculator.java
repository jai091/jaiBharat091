package com.tek.interview.question;

import java.util.Map;

/**
 * represents the calculation logic of the order items
 *
 */
public class Calculator {

	// constant values declaration - for readability of the program 
	private static final String descriptionText1 = "imported";
	private static final String descriptionText2 = "importd";
	private static final double importedItemTax = 0.15;
	private static final double localItemTax = 0.10;


	/**
	 * receives a collection of orders. For each order, iterates on the order lines and calculate the total price which
	 * is the item's price * quantity * taxes.
	 * 
	 * For each order, print the total Sales Tax paid and Total price without taxes for this order
	 */
	public void calculate(Map<String, Order> orderMap) {

		double grandtotal = 0;
		// Iterate through the orders
		if(orderMap!=null){
			for (Map.Entry<String, Order> entry : orderMap.entrySet()) {
				System.out.println("*******" + entry.getKey() + "*******");
				Order order = entry.getValue();
				double totalTax = 0;
				double total = 0;

				// check for order object not null
				if(order!=null){
					// Iterate through the items in the order
					for (int i = 0; i < order.size(); i++) {
						// Calculate the taxes
						double tax = 0;
						if(order.get(i)!=null && order.get(i).getItem()!=null){
							String description = order.get(i).getItem().getDescription();
							double price = order.get(i).getItem().getPrice();
							int quantity = order.get(i).getQuantity();
							if (description!=null && (description.toLowerCase().contains(descriptionText1) 
									|| description.toLowerCase().contains(descriptionText2))) {
								tax = price * importedItemTax; // Extra 5% tax on imported items
							}else {
								tax = price * localItemTax;
							}
							//Round of the decimals upto 2 digits
							tax = Math.round(tax*100.0)/100.0;
							// Calculate the total price
							double totalprice = price + tax;
							totalprice =  Math.round(totalprice*100.0)/100.0;
							// Print out the item's total price
							System.out.println(quantity + " " +description + ": " + totalprice);
							// Keep a running total
							totalTax += tax;
							total += price;
						}
					}
				}
				// Print out the total taxes
				System.out.println("Sales Tax: " + Math.floor(totalTax*100)/100);
				// Print out the total amount
				System.out.println("Total: " + Math.floor(total * 100) / 100);
				//total = total + totalTax;
				grandtotal += total;
			}
			System.out.println("Sum of orders: " + Math.floor(grandtotal * 100) / 100);
		}
	}
}
