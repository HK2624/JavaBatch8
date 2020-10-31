package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum=0;
		
		for(int i=1; i<6; i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
		
		System.out.println("----------------------------------------------------------------");
		
		// decleration value out of the loop
		int a;//declared 
		 //initilaized 
		for(a=1; a<6; a++) {// 5 defa loop icinde a nin degeri arti daha sonra out of loop ta anin degeri 6 oldu
			System.out.println("Value for a inside loop "+a);
		}
		System.out.println("Value for a outside of for loop "+a);//a nin degeri 6 oldu
		// en son 6<6 olunca diasri 6 cikti.
		
		System.out.println("------------------what will be the output--------------------------");
		
		   int result=0;
		
		   for(int i=10; i>=1; i--) {
			    result*=i;
		}
		       System.out.println(result);
		
		System.out.println("--------------------------------------------------------------------");
		
                int output=1;
		
		       for(int i=10; i>=1; i-=2) {
			    output*=i;
		}
		        System.out.println(output);
		        
		        System.out.println("------------IF PRINT RESULT INSDIE THE LOOP--------------------");
		        
		        int out=1;
				
			       for(int i=10; i>=1; i-=2) {
				    out*=i;
				    System.out.println("Result "+out);// each circule there will be result
			}
			       
     // calculate sum of even and odd number from range 1 to 50
			       
	 int sumO=0;
	 int sumE=0;
	 
	 for (int n=1; n<51; n++) {
		 if (n%2 ==0) {
			 sumE=n+ sumE;//SHORT WAY sumE+=n
		 
		 }if  (n%2 == 1) {
			 sumO = n + sumO;//SHORT WAY sumO+=n;
		 }
	 }
	 
	 System.out.println("The sum of even number from 1 to 50 is "+sumE);
	 System.out.println("The sum of odd number from 1 to 50 is "+sumO);
	 
	 
	 //VEYA 
	 
	 
	 int sumOdd=0;
	 int sumEven=0;
	 
	 for (int n=1; n<51; n++) {
		 if (n%2 ==0) {
			 sumEven+=n;//SHORT WAY sumE+=n
		 
		 }else {
			 sumOdd+=n;//SHORT WAY sumO+=n;
		 }
	 }
	 
	 System.out.println("The sum of even number from 1 to 50 is "+sumEven);
	 System.out.println("The sum of odd number from 1 to 50 is "+sumOdd);
	 
	 System.out.println("--------------------------------------------------------------------------");
	 
	 // I want to create a multiplication table
	 /* 1*1=1
	  * 1*2=2
	  * 
	  * 
	  * 1*10=10
	  */
	 
	   int num1=1;
	   int mult;
	   
	   for (int i=1; i<=10; i++) {
		   
		   mult=num1*i;
		   System.out.println(num1+"x"+i+" = "+mult);
	   }
	   int num2=1;
	   int multiple;
	   
	   for (int i=1; i<=10; i++) {
		   
		   multiple=num2*i;
		   System.out.println(num2+"x"+i+" = "+multiple);
	   }
	   
	   System.out.println("--------------------------------------------------------------------");
	   
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Please enter a number you would like to multiply");
	   int num3=scan.nextInt();
	   //int num3=1;
	   int multi;
	   
	   for (int i=1; i<=10; i++) {
		   
		   multi=num3*i;
		   System.out.println(num3+"x"+i+" = "+multi);
	   }
			        
	}

}
