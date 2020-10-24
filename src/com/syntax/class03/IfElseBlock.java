package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
	
		double money=5;
		double iceCream=4.59;
		
		if(money>=iceCream) {
			System.out.println("I am buying ice cream");
		}
		else {
			System.out.println("Sorry, no ice cream (((");
			System.out.println("I am code that executes without any condition");// will get ignore because condition is false
			//other ways all things come up even last words
		}	
		//System.out.println("I am code that executes without any condition");
}
}
