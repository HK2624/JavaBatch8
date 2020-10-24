package com.syntax.class03;

public class RelationalOperators {
	public static void main(String[] args) {
		
		int a=10;
		int b=15;
		
		System.out.println(a>b);// doesn't say No it shows false or true
		System.out.println(a<b);//true
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
		int x=100;
		int y=90;
		
		boolean result=x>y; //will never String or char or int because true or false, becasue you can true or false inside boolean
		System.out.println(result);
		
		result=x==y;// operation on the rightside will happen first and than we asign the value
					// how we say result without writing boolean because we reasignin the value
		            //before had true. we already asign the boolean value 
		System.out.println(result);
		System.out.println(x==y);// comparing x and y numbers and get boolean
		System.out.println(x=y);// we say x equal y so we change the x value (assignment operator)
								//assigning value of y to variable x
		//System.out.println(x!=y);
		System.out.println(x);
		
		boolean result1=x==y;
		System.out.println(result1);// because on the line 25 we change the x value thats why it shows true
		
		byte num=10;
		byte num1=10;
		
		boolean boo=num==num1;
		System.out.println(boo);
		System.out.println(num==num1);
		boolean boo1=num>=num1;
		System.out.println(boo1);
		System.out.println(num>=num1);
	}

}
