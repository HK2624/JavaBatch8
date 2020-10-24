package com.syntax.class06;

public class ExampleForNotOperators {

	public static void main(String[] args) {
		
		
		boolean isJavaEasy=false;
		if(!isJavaEasy){
			System.out.println("Please try to spend more time with Java");
			
		}
		System.out.println("-----------------------------------------------------");
		
		String day="Monday";//"Sunday"
		              // F                         F
		if(!(day.equals("Sunday") || day.equals("Saturday"))) {// BIG FALSE REVERT TO TRUE SO WILL COME OUT
			System.out.println("I am going to work");
		}
		
		//            ( F TO T  )                      F
		if(!day.equals("Sunday") || day.equals("Saturday")) {//WHEN THER EIS NO PARANTEZ
			
			System.out.println("I am going to work");
		}
		
		String day1="Sunday";
           if(!(day1.equals("Sunday") && day1.equals("Saturday"))) {
			
			System.out.println("I am going to work");
		}
	}
}
