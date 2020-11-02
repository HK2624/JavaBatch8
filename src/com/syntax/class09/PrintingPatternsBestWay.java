package com.syntax.class09;

public class PrintingPatternsBestWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int r=1; r<=4; r++) {// OUTER LOOP CONTROL ROWS
			for (int c=1; c<=6; c++) {// INNER LOOP CONTROL COLUMNS
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		for (int row=1; row<=6; row++) {
			for (int col=1; col<=12; col++) {
				System.out.print("$");
			}
			System.out.println();
		}
		
		System.out.println(" ----------------SQUARE OF THE NUMBERS---------------");
		
		for (int row=1; row<=5; row++) {
			//System.out.println(); we can put this out of the inner loop
			
			for (int col=1; col<=5; col++) {
				System.out.print(col);
			}
			System.out.println();
		   }
		System.out.println();
			
		System.out.println("-----------------------------------");
		
		for (int i=1; i<=7; i++) {
			for (int j=1; j<=8; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("_____________________________");
		// IF WE PRINT OUTER LOOP INSIDE INNER LOOP
		
		for (int i=1; i<=7; i++) {
			for (int j=1; j<=8; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------");
		
		for (int r=7; r>=1; r--) {
			for (int c=1; c<=7; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		for (int i=5; i>=1; i--) {//doesn't matter value of the outter lopp aslongas give us 5 rows
			for (int j=7; j>=1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
