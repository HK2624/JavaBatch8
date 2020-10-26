package com.syntax.class07;

public class WhileMoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day="Saturday";
		  
		if (day.equals("Saturday")) {
			System.out.println("My favorite Java class");
			
		}
		
		while (day.equals("Saturday")) {
			System.out.println("My favorite java class");// infinite printe. days always equal saturday
			day="Sunday";//to stop the infinite printing we changed value
		}
		
		boolean isItBreakTime=true;
		
		if(isItBreakTime) {
			System.out.println("I will get tea");//1 time
		}
		
		while (isItBreakTime) {
			System.out.println("I will get tea");// infinite time
			//how to break infinite(it is string)
			isItBreakTime=false;
		}
	}

}