package com.arcus.javatraining.controlflow;

public class SwitchExample {

	   public static void main(String args[]) {
	      // char grade = args[0].charAt(0);
	     
		   char grade = 'X';
		   
		   String gradeName="Grade1";

	     
		   switch(grade) {
	         
	
	      	case 'A' :
	            System.out.println("Excellent!"); 
	            System.out.println("Keep it up");
	            break;
	        
	      	case 'B' :
	        
	        
	         case 'C' :
	            System.out.println("Well done");
	            break;
	       
	         case 'D' :
	            System.out.println("You passed");
	            break;
	            
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         
	         default :
	            System.out.println("Invalid grade");
	      	 }
	      
	      System.out.println("Your grade is " + grade);
	   }
	}
