package com.syntax.class06;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input;
		   String word1;
		   String word2;
		   int num1;
		   int num2;
		   String output;
		   
		   input=new Scanner(System.in);
		   System.out.println("Please enter two strings");
		   word1=input.nextLine();
		   word2=input.nextLine();
		   System.out.println("Please enter two numbers");
		   num1=input.nextInt();
		   num2=input.nextInt();
		   //output=input.nextLine();
		   
		   if(num1==num2 && word1.equalsIgnoreCase("word2")){
		     output="AND";
		   }else if ((num1==num2 || !word1.equalsIgnoreCase("word2")) && (num1!=num2 || word1.equalsIgnoreCase("word2"))){
		     output="OR";
		   }else if (num1!=num2 && !word1.equalsIgnoreCase("word2")){
		     output="NONE";
		   }else {
			   output="Invalid";
			   
		   }
		   System.out.println(output);
		 }
		}