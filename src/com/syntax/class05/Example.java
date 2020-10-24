package com.syntax.class05;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		/*
		 *  create a java program that will ask if user has a credit card or not.
		 *  if your user doen't have a credi card than offer them
		 *  if they do have one ask what is balance on the card?
		 *  if balance of the card is larger than 1000.
		 *  ell them to pay off immeditely, otherwise you can tell them that they can spend more
		 */
		Scanner scan;
		boolean answer;
		double balance;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter if you have a credit card (true/false)");
		
		answer=scan.nextBoolean();//boolean kullanirsak double olacak
		//answer=scan.next();//if you use like that this is string  cant use this way on if
		//if (answer.equals("yes")) you can use this way. if you want to change string to boolean in if, you can write 
		//when you compare String you need to use if (answer.equals("yes"))
		if(answer) {
			System.out.println("what is the balance on your card");
			balance=scan.nextDouble();
			  
			  if(balance>1000) {
				  System.out.println("Please payy off your card balance");
				  
			  }else {
				  System.out.println("you can spend more money");
			  }
			   
		}else {
			System.out.println("would like to get a credit card?");
		}
	}

}
