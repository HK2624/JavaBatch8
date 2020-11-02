package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grades[1]);
		
		//2ND WAY
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		String[] names= {"John", "Jack", "Mike", "Juhee", "Maho", "Erika"};
		System.out.println(names[3]);
		
		//2nd way
		String[] name=new String[6];
		name[0]="John";
		name[1]="Jack";
		name[2]="Mike";
		name[3]="Juhee";
		name[4]="Maho";
		name[5]="Erika";
		System.out.println(name[3]);
		
		
		String[] words= {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		//2nd way
		String[] word=new String[5];
		word[0]="Java";
		word[1]="Saturday";
		word[2]="day";
		word[3]="coding";
		word[4]="is";
		System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);

	}

}
