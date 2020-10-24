package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
			
	     System.out.println("Please enter a day number");
	int day=scan.nextInt();
	String myDay;
	
	
	if(day==1) {
		myDay="Monday";
	}else if(day==2) {
		myDay="Tuesday"; 
	}else if(day==3) {
		myDay="Wednesday";
	}else if(day==4) {
		myDay="Thursday";
	}else if(day==5) {
		myDay="Friday";
	}else if(day==6) {
		myDay="Saturday";
	}else if(day==7) {
		myDay="Sunday";
	}else {
		myDay="Invalid Day";
	}
	System.out.println("Today is "+myDay);
	
	  System.out.println("-----SAME EXAMPLE USING SWITCH CASE------");
	  String today;
	  
	  switch(day) {// switch statement work with value not like if true or false
	               //datatype of variable must match with datatype of cases
	  case 1:// u cant use "1" it will be string but up its int. not string
		  today="Monday";
		  break;        // break will stop exacutation 
	  case 2:
		  today="Tueasday";  // inside switch case is no relational or logical && ||operation in switch  like =>,>< like that
		  break;             // switch case works only byte short char int and string. NO long float or double 
	  case 3:
		  today="Wednesday";
		  break;
	  case 4:
		  today="Thursday";
		  break;
	  case 5:
		  today="Friday";
		  break;
	  case 6:
		  today="Saturday";
		  break;
	  case 7:
		  today="Sunday";
		  break;
		  
	  default: // if deki gibi else demek// otherwise // defaul location can be anywehere , like top or on the middle
		  today="Invalid day";
		  break;// you don't have to write break on default because default is the last statement.if you write defaul on the bottom
	  }
	  System.out.println("Today is "+today);

}
}
