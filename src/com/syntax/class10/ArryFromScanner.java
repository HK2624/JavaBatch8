package com.syntax.class10;

import java.util.Scanner;

public class ArryFromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//let's ask user how many names he would like to store and then store those names
		
		Scanner scan;
		String[] names;
		int size;             //user will be define the size
		
		scan =new Scanner(System.in);
		System.out.println("How many names would you like to store");
		size=scan.nextInt();
		
		names=new String[size];
		//we are storing values into an array
		for (int i=0; i<size; i++) {
			System.out.println("Please enter any name");
			names[i]=scan.next();
		}
		
		//System.out.println(names[0]); we can do this way 0,1 2 ...OR
		
		//we are retrieving values from an array
		for (int i=0; i<names.length; i++) {
			System.out.print(names[i] +" ");
		}
		
		
	}

}
