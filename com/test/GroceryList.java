package com.test;

public class GroceryList {

	public static void main(String[] args) {

		//Create a grocery list: fruits{}
//								 veggies{}
//								 dairy{}
//		Retrieve all values using two different loops
								
		String [][] list = {
				{"apple", "orange", "banana"},
				{"potato", "carrot", "onion"},
				{"milk", "yogurt", "cheese"}
		};
		for (int i = 0; i<list.length; i++) {
			for (int j = 0; j<list[i].length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=====================================");
		
		for (String[] listArray:list) {
			for (String item:listArray) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		
		
	}

}
