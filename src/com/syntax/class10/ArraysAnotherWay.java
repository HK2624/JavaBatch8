package com.syntax.class10;

public class ArraysAnotherWay {

	public static void main(String[] args) {
		
		String[] names= {"Mike", "Burju", "Jack", "Danilo", "Bryan", "Evgeniya"};
		// IN THIS WAY YOU CANNOT ADD VALUE LATER
		//names[]=ahmet; won't work
		
		/*String[] name;      // cannot do it in 2 steps this way
		name= {"Sabeen"}*/   // will not work either too also you Cannot break down
		
		System.out.println(names[3]);
		
		//how do I know how many elements I have in the array?
		int size=names.length;
		System.out.println("Size of names array = "+size);
		
		//THAT MEANS 5-2=3 name[3]
		System.out.println(names[names.length-2]);
		
		int a=2;
		System.out.println(names[a]);//Jack
		
		a+=2;
		System.out.println(names[a]);//Bryan
		
	
		
		for(int i=0; i<names.length; i++) {
			
			System.out.println(names[i]);
		}
		System.out.println("------------------------------------------------------------------");
		
           //for(int i=0; i<=names.length; i++) {// will get an exception because length will be 6 
			//and highest index we have 5 ////To fix it we can write i<=names.length-1;
		
			//System.out.println(names[i]);
			//}
         for(int i=0; i<=names.length-1; i++) {
			
			 System.out.println(names[i]);
         }
	}
}
