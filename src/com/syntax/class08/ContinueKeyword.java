package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		
		//continue-- skip current iteration
		// it can be use inside loop
		
		
		// I want to print numbers from 1 to 5 except number 3
		
		for(int i=1; i<=5; i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("END of the loop");
		
		//I want to print number 1 to 10 except number 3&7
		
		for(int i=1; i<=10; i++) {
			
			if (i==3 || i==7) {
				continue;
			}
			System.out.println(i);
		}

	}

}
