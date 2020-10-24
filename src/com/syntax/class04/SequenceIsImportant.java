package com.syntax.class04;

public class SequenceIsImportant {
public static void main(String[] args) {
	//debug your code later and analyze what is the issue!!(to find the issue you have to debug)
	//do not make that mistake!!!!
	int score=85;
	boolean assignment=true;
	
	if(assignment) {
		   
		   if(score>90) {//sequences error it will read 70 and than will not read rest of it
			   System.out.println("You did great!!!!!");
		   }else if(score>70)   {
			   System.out.println("Probably you need to study more");
		   }else if(score>80){
			   System.out.println("You did good!");
		   }else {
			   System.out.println("Good job for trying but you must study!");
		   }
		
	}else {
		System.out.println("You should always complete all assignments");
	}
	
	
}
}
