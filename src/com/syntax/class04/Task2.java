package com.syntax.class04;

public class Task2 {
	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpa=2.5;
		
	if(diploma) {
			System.out.println("Congratulations");
	
			if(gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			
		     }else {
			System.out.println("You should have studied harder");
		}
	
	    }else {
		System.out.println("You should get a degree");
	}
	
	System.out.println("-------------example--------------");
	
	  double mortgageRate=2.98;
	  int price=200000;
	  
	  if(mortgageRate>4.5) {
		  System.out.println("will not buy a house");
		  
		  
	  }else {
		  System.out.println("I wll think to buy a house");
		  if(price>200000) {
			  System.out.println("will take a loan");
		  }else
		  System.out.println("will pay cash");
		  
	  }
		  
	}

}
