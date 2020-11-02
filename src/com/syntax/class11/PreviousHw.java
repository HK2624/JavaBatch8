package com.syntax.class11;

import java.util.Scanner;

public class PreviousHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//hw3;Create an array of animals and store 6 elements into it.using 2 different loops 
		//print all elements from the array
		
		String[] animals = {"Lion","Tiger","Panther","Gorilla","Cheeta","Liger"};
		
		for (int i=0; i<animals.length; i++) {//if we write i=1; it will skip first element(Lion)
			System.out.println(animals[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
		//2ND WAY
		for (String anim: animals) {
			System.out.println(anim+" ");
		}
		System.out.println();
		
		//HW2; Create an array on double using scanner 
		//and calculate the sum of all double elements in an array
		
		Scanner scan;
		double[] num;
		double sum=0;
		int size;
		scan= new Scanner(System.in);
		System.out.println("How many numbers would you like to add up?");
		size=scan.nextInt();
		
		num= new double[size];
		//store values into array
		for(int i=0; i<size; i++) {// we can use i<num.length will work in this case
			System.out.println("Please enter double numbers");
			num[i] =scan.nextDouble();
		}
		
		//loop through created array
		//for (int i=0; i<num.length; i++) {
			//sum =sum+ num[i];
		//} WE CAN USE INHENCED FOR LOOP 
		
		for (double number : num) {
			sum+=number;
		}
		System.out.println(sum);
		
		
	}   

}
