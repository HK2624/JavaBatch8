package com.syntax.class10;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		//Hw1; Create an array on integers and calculate the sum of all elements in array
				
		  Scanner input;
		  int[] num;
		  int sum=0;
		  int size;
		  
		  input=new Scanner(System.in);
		  System.out.println("How many integer numbers would you like to write?");
		  size=input.nextInt();
		  
		  num= new int[size];
		  for (int i=0; i<size; i++) {
			  System.out.println("Please enter integer number");
			 num[i]= input.nextInt();
		  }
		  //for(int i=0; i<num.length; i++) {if we use enhnced for
			  //sum+=num[i];
		 // }
		  for(int number : num) {
			  sum+=number;
		  }
		  System.out.println(sum);
	}

}
