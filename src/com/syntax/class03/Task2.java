package com.syntax.class03;

public class Task2 {
	public static void main(String[] args) {
		
		boolean sleepy=false;
		//if not sleepy--> I will study otherwise I will take a nap
		//if statemnt works as long as we have boolean condition
		
		if( sleepy==true) {// we don't need to write like that it is already boolean con. so "if(sleepy) can write
			System.out.println("I will take a nap");
		}
		else {
			System.out.println("I will study some java");
		}
		 boolean hungry=true;
		if(hungry) {
		System.out.println("I will go eat");
		}else {
			System.out.println("I will continue studying");
		}
		
		double var1=4.95;
		double var2=7.98;
		if(var1>var2) {
			System.out.println("Double value 4.95 is larger than 7.98");
		}else {
			System.out.println("Double value 7.98 is larger than 4.95");
		}
		
		int Temp=50;
		
		if(Temp<32) {
			System.out.println("Water will freeze with temperatue 50");
		}else {
			System.out.println("Water will NOT freeze with temperature 50");
		}
	}

}
