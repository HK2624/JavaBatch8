package com.syntax.class11;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I would like to find largest number from the array?
		int[] array= {1000,10,0,20,8, -100,-1,77,56};
		
		int max= array[0]; //we assign the first elemnt of array that's why i=1
		//if we assign int max=0; the bottom "i" would be i=0 because we already take number 10
		for (int i=1; i<array.length; i++) {
			
			if(array[i]>max) {// max number is the first element 
				max=array[i];// reassign the max
			}
		}
		System.out.println("The largest number from an array is "+max);
	}

}
