package com.syntax.class05;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		
		String day="Sunday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today I have a java class at Syntex");
		}
		
		System.out.println("The End");
		
		System.out.println("-----------------------------------------");
		
		/*if day is 1 or 5---> i'm off from syntax
		 * if day 2 or 3 ---> GIT classes
		 * if day is 4---> Review Class
		 * if day 6 or 7----> Java class
		 * everything else will be invalid day
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter todays day using numbers only");
		
		int today=scan.nextInt();
		
		if(today==1 || today==5) {
			System.out.println("I am off from Syntax");
			
		}else if (today==2 || today==3) {
			System.out.println("Today is GIT class");
		}else if (today==4) {
			System.out.println("Today is Review class");
		}else if (today==6 || today==7) {
			System.out.println("Today is Java class");
		}else {
			System.out.println("Please enter a valid day from 1 to 7");
		}
	}
}
