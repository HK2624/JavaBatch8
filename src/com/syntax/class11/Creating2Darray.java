package com.syntax.class11;

public class Creating2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create 2D array of food:
		//american
		//italian
		//asian
		//afghani
		//indian
		
		String[][] food= {
				
				{"steak", "hot dog", "Cheese burger"},
				{"pizza", "pasta", "canoli"},
				{"sushi", "ramen", "fried rice", "dumblings"},
				{"kebab", "manto"},
				{"beriyani", "masal", "curry", "Chicken tikka masala"}
		};

		// ENhanced for loop
		for(String[] dishes: food) {
			
			for(String dish:dishes) {
				
				System.out.print(dish+"  ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------");
		// regular for loop;
		
		for(int i=0; i<food.length; i++) {
			
			for(int j=0; j<food[i].length; j++) {
				
				System.out.print(food[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
