package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner input;
		int height;
		input=new Scanner(System.in);
		System.out.println("Please enter your height");
		height=input.nextInt();
		
		if(height<60){
			System.out.println("Short height");
		}else if (height>60 && height<72) {
			System.out.println("Medium height");
		}else if (height>72) {
			System.out.println("Tall height");
		}else {
			System.out.println("Invalid enter");
		}
		
		
		System.out.println("---------------------------------------------");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int day=scan.nextInt();
		
		if(day>=1 && day<=5) {
			System.out.println("It is a weekday");
		}else if(day==6 && day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid entry");
		}
		
		
		}
}
