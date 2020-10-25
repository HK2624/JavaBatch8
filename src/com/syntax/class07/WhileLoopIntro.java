package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int time=13;
		
		if (time>12) { // condition is true
			 
			   System.out.println("good day");// code executes 1 time
			}
         System.out.println("--------------------------WHILE LOOP---------------------------------------------");
         
         //while (time>12) {
        	 //System.out.println("good day");//give us infinite loop
        	 //time--;
         //}
         int time1=15;
         
         while (time1>12) {// 3 times will execute
        	 System.out.println("good day");
        	 time1--;
         }
          //int time2=15;
         //while (time2>12) {// how many times? INFINITE LOOP
        	// System.out.println("good day");
        	 //time2++;
       //  }
         //I want to print numbers from 1 to 50
           System.out.println("PRINTING NUMBER 1 TO 50-------------------------");
         int num=0;
         
         while(num<=50) {
        	 System.out.println(num);
        	 num++;
         }
       //I want to print numbers from 10 to 60
         System.out.println("PRINTING NUMBER 10 TO 60-------------------------");
       int a=10;
       
       while(a<61) {
      	 System.out.print(a+" ");
      	 a++;
       }
       System.out.println();
       System.out.println("PRINTING NUMBERS 100 TO 60----------------------------------");
       // I want to print numbers from 100 to 60
       
       int b=100;
       
       while(b>=60) {
    	   System.out.print(b+" ");
    	   b--;
       }
       System.out.println();
       System.out.println("PRINTING NUMBERS 10 TO 30- ONLY EVEN NUMBERS---------------------------------");
       // I want to print numbers from 10 to 30 only even numbers
       
       int c=10;
       while(c<31) {
    	   if(c%2==0) {
    	   System.out.print(c+" ");
    	   }
    	   c++;
       }
       System.out.println();
       System.out.println("--------ANOTHER WAY---------------");
       
       int d=10;
       
       while(d<=30) {
    	   System.out.print(d+" ");
    	   d+=2;
       }
       System.out.println();
       //YUKARDAKININ AYNISIS PARANTEZE DIKKAT

       int x=10;
       while(x<31) {
    	   //System.out.println("I am inside while loop");
    	   if(x%2==0) {
    	   System.out.print(x+" ");
    	   //x++;// loop will not stop and only print one time. the code stuck inside infinite loop
    	   //if we keep increment here -->we will get infinite loop
    	   }
    	   x++;
       }
       System.out.println();
       
           //print number from 100 to 1 odd numbers 
       int y=99;
       
       while (y>0) {
    	   System.out.print(y+" ");
    	   y-=2;
       }
       System.out.println();
       System.out.println("---Another Way----");
       
       int z=100;
        while (z>0) {
        	if ((z % 2) !=0) {
        		System.out.print(z+" ");
        	}
        	z--;
        }
	}

}
