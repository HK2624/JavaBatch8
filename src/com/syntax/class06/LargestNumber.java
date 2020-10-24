package com.syntax.class06;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1, num2, num3, max;
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		num3 = scanner.nextDouble();
		scanner.close();// close the scanner. otherwise you can write more number
		// 1st way
		
	 //if(!(num1 == num2 && num2 == num3)) If we use NOT operator we can write this way
	 if(num1!=num2 && num2!=num3) {
		
		  if (num1 > num2 && num1> num3) {
			max =num1;
		} else if (num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}
         System.out.println(max);
	}else {
		System.out.println("Number are equal");
		System.out.println("Largest value is "+num1);
		
	}
	System.out.println("-----------------PLACING COMPARISONG IN ELSE PART----------------------------------------------");
		
	
	      if(num1==num2 && num2==num3 ) {
	    	  System.out.println("Number are equal");
	      }
	    	  
	        
			
	     
	System.out.println("--------------COMPARING NUMERS USING NESTED IF----------------");
	
		double biggest;//int biggest
		System.out.println("-------comparing 2 number-------(only nested if kullanildi");
		// 2nd way
		if (num1 > num2) {//if number1 larger than number2
			if (num1 > num3) {
				biggest = num1;//biggest=(int)num1
			} else {
				biggest = num3;
			}
		} else   {//number 2 is larger than number1
		   if(num2>num3) {
			biggest = num2;
		   }  else {
			biggest= num3;
		}
	}
		System.out.println("The largest number is " +biggest);
	}
}
