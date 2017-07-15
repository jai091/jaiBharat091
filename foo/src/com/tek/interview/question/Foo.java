package com.tek.interview.question;

import java.util.HashMap;
import java.util.Map;

public class Foo {

	public static void main(String[] args) {
		try{
			System.out.println("**********Unit Testing with different datasets*********");
			//Data set1 with three orders
			calculateOrdersForDataSet1();
			//Data set2 with empty orders
			calculateOrdersForDataSet2();
			//Data set3 for exception case
			calculateOrdersForDataSet3();
			//Throwable catch block for handling any kind of exception including RunTime exceptions	
		}catch(Throwable throwable){
			System.out.println("Program execution ended abnormally due to : " + throwable);
		}
	}

	private static void calculateOrdersForDataSet1() throws Exception{

		System.out.println("\n**********Order DataSet1*********\n");
		
		Map<String, Order> orderMap = new HashMap<String, Order>();

		//Data set 1 with three orders
		Order order1 = new Order();
		order1.add(new OrderLine(new Item("book", (double) 12.49), 1));
		order1.add(new OrderLine(new Item("music CD", (double) 14.99), 1));
		order1.add(new OrderLine(new Item("chocolate bar", (double) 0.85), 1));

		orderMap.put("Order 1", order1);

		Order order2 = new Order();
		order2.add(new OrderLine(new Item("imported box of chocolate", 10), 1));
		order2.add(new OrderLine(new Item("imported bottle of perfume", (double) 47.50), 1));

		orderMap.put("Order 2", order2);

		Order order3 = new Order();
		order3.add(new OrderLine(new Item("Imported bottle of perfume", (double) 27.99), 1));
		order3.add(new OrderLine(new Item("bottle of perfume", (double) 18.99), 1));
		order3.add(new OrderLine(new Item("packet of headache pills", (double) 9.75), 1));
		order3.add(new OrderLine(new Item("box of importd chocolates", (double) 11.25), 1));

		orderMap.put("Order 3", order3);

		Calculator calculator= new Calculator();
		calculator.calculate(orderMap);
	}



	private static void calculateOrdersForDataSet2() throws Exception{
		System.out.println("\n**********Order DataSet2*********\n");
		Map<String, Order> orderMap = new HashMap<String, Order>();
		//Data set 2 with no orders
		Calculator calculator= new Calculator();
		calculator.calculate(orderMap);
	}
	
	
	private static void calculateOrdersForDataSet3() throws Exception{

		System.out.println("\n**********Order DataSet3*********\n");
		
		Map<String, Order> orderMap = new HashMap<String, Order>();

		orderMap.put("Order 1", null);
		
		Order order2 = new Order();
		order2.add(new OrderLine(new Item("imported box of chocolate", 20), 0));
		order2.add(new OrderLine(new Item("imported bottle of perfume", (double) 47.50), 1));

		orderMap.put("Order 2", order2);
		Calculator calculator= new Calculator();
		calculator.calculate(orderMap);
	}
}
