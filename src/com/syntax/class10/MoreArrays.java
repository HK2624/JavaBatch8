package com.syntax.class10;

public class MoreArrays{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grade = {'A', 'B', 'C', 'D', 'E', 'F', 'H'};
		char secndValue=grade[1];
		 
		 String[] names= {"Mike", "Burju", "Jack", "Danilo", "Bryan", "Evgeniya"};
		 String secondValue=names[1];
		 
		 //get all values from grade array
		 for (int i=0; i<grade.length; i++) {
			 
			 char valueFromArray=grade[i];
			 System.out.println(valueFromArray);
		 }
		 
		
	}

}