package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean workDay=true;
		
		int day=1;
		
		while(workDay) {
			
			if(day<6) {
				System.out.println("I need a day off");
			}else {
				System.out.println("It is weekend adn I'am off");
				//to break infinite while loop change the value
				workDay=false;
			}
			day++;
		}	

	}

}
