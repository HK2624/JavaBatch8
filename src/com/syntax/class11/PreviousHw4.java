package com.syntax.class11;

public class PreviousHw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hw4;Create an array of countries. while retrieving all values from an array print
		//capital for each country(use 2 different loops)

		String[] countries= {"USA", "Ukraine", "Canada"};
		String[] capitals = {"DC", "Kyiv", "Ottawa"};// if we change the sequence it WON'T work
		
		for (int v=0; v< countries.length; v++) {
			System.out.println("The capital of "+countries[v]+" is "+capitals[v]);
		}
		//2ND WAY BUT BEST WAY ABOVE CANNOT BE TRUE EVERSITUATION
		System.out.println("-------------------------------------");
		
		  String capital;
		  
		for(String country : countries) {
			
			 switch (country) {
			 
			 case"USA":
				 capital="DC";
				 break;
			 case"Ukraine": 
				 capital="Kiev";
				 break;
			 case"Canada":
				 capital="Ottawa";
				 break;
			 default:
				 capital="I do not know";
			 }
			 System.out.println("Capital of the country "+country+" is "+capital);
		}
	}

}
