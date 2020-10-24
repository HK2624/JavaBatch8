package com.syntax.class04;

import java.util.Scanner;

// shortcut to import Ctr+shift+o

public class ScannerDemo {
	public static void main(String[] args) {
		
		
		int num=80;//primitive
		String str="I am a String";//non-primitive(always write upercase
		
		Scanner scan=new Scanner(System.in);//enable input to the console
		//I am adding some message to the user;
		System.out.println("Please enter any text");
		
		String value=scan.nextLine();//waits for your input and once you provided input-->hit ENTER BUTTON
		
		System.out.println("I captured String value = "+value);
		
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you "+name);
	}
	

}
