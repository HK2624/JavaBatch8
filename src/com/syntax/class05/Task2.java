package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan;
		int quiz, midTerm, finalScore, avg;
		scan=new Scanner(System.in);
				
		System.out.println("Please enter your quiz score");
		quiz=scan.nextInt();
		
		System.out.println("Please enter your mid term score");
		midTerm=scan.nextInt();
		
		System.out.println("Please enter your final score");
		finalScore=scan.nextInt();
		
		avg =(quiz+midTerm+finalScore)/3;
		
		
		if(avg>=90) {
			System.out.println("Grade A");
			//System.out.println("you are a good student");
		}else if(avg>=70 && avg<=90){
			System.out.println("Grade B");
			//System.out.println("you are a good student");
		}else if(avg>=50 && avg<70) {
			System.out.println("Grade C");
			//System.out.println("Please study more");
		}else if(avg>=40 && avg<50) {
			System.out.println("Grade D");
			//System.out.println("Please study more");
		}else {
			System.out.println("Grade F");
			//System.out.println("Please study more");
		}
		
		//if your grade is A or B-->I'M GONNA SAY; YOU ARE A GOOD STUDENT
		
		System.out.println("---------------OTHER WAY-----------------------");
		
		
		
		System.out.println("Please enter your quiz score");
        quiz = scan.nextInt();
        
        System.out.println("Please enter your mid term score");
        midTerm = scan.nextInt();
        
        System.out.println("Please enter your final score");
        finalScore = scan.nextInt();
        
        avg = (quiz + midTerm + finalScore)/3;
        System.out.println(avg);
        
        char grade;
        
        if(avg>=90) {
            grade='A';
        }else if(avg>=70 && avg<90) {
            grade='B';
        }else if (avg>=50 && avg <70) {
            grade='C';
        }else if (avg>=40 && avg<50) {
            grade='D';
        }else {
            grade='F';
        }
        System.out.println("Grade is = "+grade);
        
        if(grade=='A' || grade =='B') {
            System.out.println("You are good student");
        }else {
            System.out.println("Please study more");
        }

		
	}
}
