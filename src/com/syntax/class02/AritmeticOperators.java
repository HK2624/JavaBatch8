package com.syntax.class02;

public class AritmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//when use number it will act aritmatic operation but string and number not 
		int num1, num2;
		num1=9;
		num2=7;
		System.out.println(num1+num2);

		//Aritmatic Operators: +, -, *, /, %
		System.out.println(num1-num2);
		
		double num3=10.99;
		double num4=2.99;
		
		double mult=num3*num4;
		System.out.println(mult);
		
		double div=num3/num4;
		System.out.println("The result of division of 2 double values="+div);
		
		//float take up to 5 to 6 decimal but double up to 14 or 15 ecimal
		float f1=10.99f;
		float f2=2.99f;
		System.out.println("The result of divison of float values="+f1/f2);
				
	}

}
