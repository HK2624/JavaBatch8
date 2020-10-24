package com.syntax.class05;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		Scanner input;
		double workedYears;
		int annualSalary;
		input= new Scanner(System.in);
		
		System.out.println("Please enter numbers of worked years");
		
		workedYears=input.nextDouble();
		
		if(workedYears>=5) {
			
			     System.out.println("Please enter your annual salary");
			     
			          annualSalary=input.nextInt();
			     if(annualSalary>=50000) {
			    	 System.out.println("your bonus is 5000$");
			     }else {
			    	 System.out.println("Your bomus is 3000$");
			     }
			
			
			}else {
			
			System.out.println("Sorry, you are not eligible for bonus");
			
		}
	}
}
