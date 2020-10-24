package com.syntax.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter the amount of loan you need");
		
		int loan=input.nextInt();
		
		if(loan<=200000) {
			System.out.println("you can borrow money");
		}else {
			System.out.println("Sorry you can't get loan");
		}
		
		
		System.out.println("-------------------------------------");
		
		System.out.println("how old are you?");
		int age=input.nextInt();
		if(age>=18) {
			System.out.println("you will be issue a driver licence");
		}else {
			System.out.println("You can get a learners permit");
		}
		System.out.println("-------------------------------------------------");
		
		System.out.println("where do you live in?");
		
		String city=input.next();
		
		System.out.println("what is the temperature in "+city+"?");
		
		int temperature=input.nextInt();
		int celsius=((temperature-32)*5)/9;
		System.out.println("The temperature is the "+city+" is "+celsius+" C");
	
	}
}
