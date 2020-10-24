package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan;
		char grade;
		String message;
		scan=new Scanner(System.in);
		System.out.println("Please enter your grade in verbale");
		grade=scan.next().charAt(0);
		
		switch(grade) {
		
		
		case 'A':
			message="A-Excellent";
		break;
		case 'B':
		    message="B-Good";
		 break;
		case 'C':
			 message="C-Avarage";
		 break;
		case 'D':
			message="D-Bad";
		  break;
		  
		  default:
			  message="Not Acceptable";
		}
		System.out.println(message);
	}
}
