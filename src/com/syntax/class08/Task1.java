package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
		
		for(int a=100; a>=1; a--) {
			System.out.print(a+" ");
			
		}
		//1st way
		System.out.println();
		for(int i=20; i>0; i-=2) {
			System.out.print(i+" ");
		}
		
		//2nd way
		System.out.println();
		
		for( int i=20; i>=1; i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		//1 st way
		System.out.println();
		
		for(int b=21; b<50; b+=2) {
			System.out.print(b+" ");
		}
		
		//2nd way
		System.out.println();
		
		for(int b=20; b<50; b++) {
			if (b%2 !=0) {
				System.out.print(b+" ");
			}
		}
	}

}
