package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// [] CALL INDEX
		int[] num = new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		//to access element from an array?
		
		System.out.println("Accessing 3 element "+num[3]);
		System.out.println(num[2]);
		System.out.println(num[1]+num[4]);
		
		// i would like to change 50 to 100
		num[4]=100;
		System.out.println("value of 5th element after change(reassigning) "+num[4]);
		
		// you can only store same type of variable 
		int[] array=new int[2];
		//array[0]=10.99; TYPE OF VALUE MUST BE INTEGER
		// we can store double value inside integer if we narrowing/explicitly
		
		String[] array1=new String[4];
		array1[0]="Hello";
		array1[1]="Hi";
		array1[2]="Bye";
		array1[3]="Yay";
	}

}
