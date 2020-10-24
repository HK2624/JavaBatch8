package com.syntax.class06;

import java.util.Scanner;

public class Hw2FromCourseAnnouncements {

	public static void main(String [] args) {
		
		Scanner input;
		String country;
		String language;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your hometown country?");
		 country=input.nextLine();
		 
		 switch(country.toLowerCase())  {
		    
		 case "usa":
			 language="English";
		 break; 
		 case "uk":
			 language="English";
	     break;
		 case "germany":
			 language="Dutch";
	     break;
		 case "russia":
			 language="Russian";
		 break;
		 case "france":
			 language="France";
		 break;
		 case "portuguese":
			 language="Poruguese";
		 break;
		 case "spain":
			 language="Spanish";
		 break;
		 case "eygpt":
			 language="Arabic";
		 break;
		 case "turkey":
			 language="Turkish";
		 break;
		 case "brazil":
			 language="Portuguese";
		 break;
		 case "south korea":
			 language="Korean";
		break;
		 case "china":
			 language="chinese";
		 break;
		 default:
			 language="Invalid entery";
		 break;
		 }
		
		System.out.println(language);
		
		System.out.println("-------------------------------------HW2-------------------------------------------");
		
		double num1;
		double num2;
		char operators;
		double results=0;
		
		System.out.println("Please enter numbers");
		num1=input.nextDouble();
		num2=input.nextDouble();
		System.out.println("Please enter operators");
		operators=input.next().charAt(0);
		
		if(operators=='+') {
			 results=num1+num2;
		}else if(operators=='-') {
			results=num1-num2;
		}else if(operators=='*') {
			results=num1*num2;
		}else if(operators=='/') {
			results=num1/num2;
		}else if(operators=='%') {
			results=num1%num2;
		}else {
			System.out.println("Invalid operators");
			//result=0; veya yukari yazarsin
		}
		System.out.println(results);
		
		
		switch(operators) {
		
		case '+':
			results=num1+num2;
	    break;
		case '-':
			results=num1-num2;
		break;
		case '*':
			results=num1*num2;
		break;
		case '/':
			results=num1/num2;
		break;
		case '%':
			results=num1%num2;
		break;
		default:
			System.out.println("Invalid operators");
		break;
		}
		System.out.println(results);
	}
}
