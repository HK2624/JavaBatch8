package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * lets ask tester on which browser they would like to use
		 */
		Scanner scan;
		String browser;
		String message;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser=scan.nextLine();
		
		switch(browser) {
		
		case "safari":// case sensetiv exmpl. you can write on the bottom Safari.
			  message="You code will be executed on Safari browser";
			  break;
		case"chrome":
			 message="You code will be executed on Chrome browser";
			 break;
		case"firefox":
			message="You code will be executed on Firefox browser";
			break;
		default:
			message="Entered browser is not supported";
		}
		System.out.println(message);
		
		
		
		
       switch(browser.toLowerCase()) {//buyuk harfle yazarsan covert to kucuk letter
		                          // for upper case;
                              //(browser.toUpperCase())
		case "safari":// case sensetiv exmpl. you can write on the bottom Safari.
			  message="You code will be executed on Safari browser";
			  break;
		case"chrome":
			 message="You code will be executed on Chrome browser";
			 break;
		case"firefox":
			message="You code will be executed on Firefox browser";
			break;
		default:
			message="Entered browser is not supported";
		}
		System.out.println(message);
		
		// swich is good when you have multiple chooice 
		// Switch cannot work with double, float, long, boolean
		
		float f=10.99f;
		double d=19.90;
		long l=190909;
		
		//switch(f) {} CE(COMPAILER ERROR)  cannot switch on a value of type float.
		// douplicate cases not allowed on switch
		
	}
}
