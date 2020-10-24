package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*write a program for user to enter his/her birth month, based on the month
		 * define the season exm; if user born in june , july or august--> seasin is summer
		 * at the end of the program we should see output as you were born---"
		 */
		Scanner scan;
		String month;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your birth month");
		
		month=scan.next();
		
		if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("july") || month.equalsIgnoreCase("August")) {
			System.out.println("You were born in Summer");
		}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November") ) {
			System.out.println("You were born in Fall");
		}else if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") ) {
			System.out.println("You were born in Winter");
		}else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("You were born in Spring");
		} 
		
		System.out.println("You were born in "+month);
	}
}
