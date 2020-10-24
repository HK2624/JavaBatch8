package com.syntax.class06;
import java.util.Scanner;
public class Hw1 {
	public static void main(String[] args) {
		Scanner input;
		double sales;
		double commission;
		
		input=new Scanner(System.in);
		
		System.out.println("Please Enter Sales Amount?");
		sales=input.nextDouble();
		
		if(sales>=10 && sales<100) {
			commission=(sales*10)/100;
		}else if(sales>=100 || sales<200) {//T and F it gives wrong output
			commission=(sales*20)/100;
		}else if(sales>=200 && sales<500) {
			commission=(sales*30)/100;
		}else if(sales>=500) {
			commission=(sales*50)/100;
		}else {
			commission=0;
		}
		
		System.out.println("You will get $"+commission+ " commission.");
		
		//if you sell more than 1K--> you are an awsome seller
		
		if(commission>1000) {
		System.out.println("You are an awsome seller");
		}
	}
}