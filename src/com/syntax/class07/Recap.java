package com.syntax.class07;

public class Recap {
	public static void main(String[] args) {
		String timeOfDay="Morning";
		String day="Saturday";
		
		switch(timeOfDay) {
		
		case "Morning":
			System.out.print("Good Morning");
			// we can nested IF or we can put switch case

			/*if(day.equals("Saturday")){
				System.out.println("Class!");
			}else if(day.equals("Monday")) {
				System.out.println("Colleague");
			}*/
			switch(day) {
			case"Monday":
				System.out.println("Colleague");
				break;
			case"Thursday":
				System.out.println("Asghar");
				break;
			case "Saturday":
				System.out.println("Class");
				break;
			}
			
			break;
		case "Noon":
			System.out.println("Good Afternoon");
			break;
		case "Evening":
			System.out.println("Good Evening");
			break;
		case "Night":
			System.out.println("Good Night");
			break;
		case "Saturday":
			System.out.println("hello class");
		default:
			System.out.println("N/A");
		}
		
	}

}
