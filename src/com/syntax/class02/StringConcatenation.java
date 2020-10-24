package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String lastName;
		byte grade;
		String city;
		String state;
		long phoneNumber;
		
		name="Juhee";
		lastName="Son";
		grade=4;
		city="Long Island City";
		state="New York";
		phoneNumber=3479328456L;
		System.out.println("My name is "+name);
		System.out.println("My last name is "+lastName);
		System.out.println("I'm a "+grade+"th grade student");
		System.out.println("I live in city of "+city);
		System.out.println("I live in state of "+state);
		System.out.println("My phone number is "+phoneNumber);
		System.out.println("My full name is " +name+lastName);
		System.out.println(name+" "+lastName);
		System.out.println(name+" is "+grade+"th grade student");
		
		int date=29;
		String month="September";
		// write september 29
		System.out.println(date+" "+month);
		System.out.println(date+" "+"month");
	}

}
