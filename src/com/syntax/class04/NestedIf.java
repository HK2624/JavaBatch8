package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		/*variable for allergy--yes or no
		 * if allergy is yes --->
		 *                   we will check if per allergy
		 *                                  if peanut allergy
		 *                                  if pollen allergy
		 *  if no allergy you are lucky                                
		 */
		
		boolean allergy=true;
		
		boolean petAllergy=true;
		boolean peanutAllergy=false;
		boolean pollenAllergy=false;
		
		if(allergy)	{
			System.out.println("let's do further check");
			
			if(petAllergy) {
				System.out.println("Please no cats or dogs in the house ");
			
			}	else {
				System.out.println("That is good you don not have pet allergy");
			}
		}else {
			System.out.println("You are lucky");
		}	
		
		
		System.out.println("------------------------------------------------------");
		
		/*if the day is Friday we will watch movie but would like to check the date
		 *                          if date is 13----->watch scary movie
		 *                          and if is not----->I will watch comedy, action
		 *  if no Friday----> I am studying                        
		 */
		
		boolean isFriday=true;
		int date=13;
		boolean monday=true;
	
		if(isFriday) {
			
			if (date==13) {
				System.out.println("I will watch scary movie");
			}else {
				System.out.println("I will watch Pk movie with AmirKhan");
			}
			
		}else { //all of them will ignore because it will start up to down
			// so friday is true and will skip bottom
			//don't check nested if first either if or else will be check first
			if(monday) {
			System.out.println("I'm not studying, I'am working");
			}else {
				System.out.println("I have class at Syntax");
			
			}
		}
		System.out.println("--------------------EXAMPLE-----------------------------------------------");
		/*check if assignment is completed
		 * if assignment is completed:
		 *                       if score >90--> great job
		 *                       if score >80--> good job
		 *                       if score >70--> please study more
		 * 
		 */
		int score=70;
		boolean assignment=true;
		
		if(assignment) {
			   
			   if(score>90) {
				   System.out.println("You did great!!!!!");
			   }else if(score>80)   {
				   System.out.println("You did good!");
			   }else if(score>70){
				   System.out.println("Probably you need to study more");
			   }else {
				   System.out.println("Good job for trying but you must study!");
			   }
			
		}else {
			System.out.println("You should always complete all assignments");
		}
		
		}
	}

