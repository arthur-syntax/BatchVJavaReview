package com.test;

import java.util.Scanner;

public class ArrayScaner {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		    String[] array = new String[7];


		    for (int i = 0; i <array.length; i++) {
		    	System.out.println("Please enter day " + (i+1) + " of the week:");
		        array[i] = s.nextLine();
		    }

		    System.out.println(array[1]);
		    
		    int arr[][]= {
		    		{1,2},
		    		{1,2,3}
		    };
    System.out.println(arr.length);//number of rows
    System.out.println(arr[1].length);//number of specific column
    		 
    	 }
     
		    

	}


