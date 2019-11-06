package com.test;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {

		 Scanner scan;
		 int age;
		    
		    scan = new Scanner(System.in);
		    String gender = scan.nextLine();
		    age = scan.nextInt();
		    
		    
		     if(age > 25) {
		       
		        
		         if(gender.equalsIgnoreCase("M")) {
		            System.out.println("Man");
		         }
		         else {
		           System.out.println("Woman");
		         }
		    
		    
		  }
		    else {
		        if(gender.equalsIgnoreCase("M")) {
		          System.out.println("Boy");
		           }
		           else {
		           System.out.println("Girl");
		           }
		         }
		
		
	}

}
