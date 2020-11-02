package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] array= {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
		       };
		System.out.println(array[0][1]+" "+array[1][0]);
		System.out.println(array[0][0]+" "+array[1][3]);
		System.out.println(array[0][2]+" "+array[1][2]);
		System.out.println(array[0][3]+" "+array[1][1]);
		
		System.out.println("-----------------------------------------------------------");
		
		//TASK2;
		//Create an array of cars : american, german, korean, italian. 
		//And print all values from a 2D array
		
		String[][] cars ={
				   {"Jeep","Ford","Dodge"},
				   {"Audi","Porsche","BMW"},
				   {"Kia","Hyundai","Genesis"},
				   {"Ferrari","Maserati","Lamborghini"}
				   };
		
		for(int i=0; i<cars.length; i++) {
			
			for(int j=0; j<cars[i].length; j++) {
				//System.out.println(cars[i][j]);// veya
				
				String car=cars[i][j];
				System.out.print(car+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------------------------");
		
		//ENHANCED "FOR"
		
		for(String[] carArray:cars) {
			
			for(String car:carArray) {
				
				System.out.print(car+"  ");
			}
			
			System.out.println();
		}
	}

}
