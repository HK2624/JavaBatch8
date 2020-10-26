package com.syntax.class08;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i=1; i<=5; i++) {
			System.out.println("Good Morning");
		}
		
		// I want to say 5 times good morning
		
		/* FOR SYNTAX
		 * 
		 * FOR(initialization; condition; increment/decrement)
		 */
		for (int i=5; i<10; i++) {
			System.out.println("Good Morning");
		}
		
		// I want to print number 1 to 100
		
		/* FOR SYNTAX
		 * 
		 * for(start point; end point; increment/decrement)
		 * code;
		 */
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("--------I want to print number 10 to 0--------");
		
		for(int i=10; i>=0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-------------what will be output?------------------------------");
		
		for(int i=0; i<=30; i+=3) {
			System.out.print(i+" ");
		}
			
		
	}

}
