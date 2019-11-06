package com.test;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		Scanner scan;
		int start;
		int end;
		int sumOdd = 0;
		int sumEven = 0;
		
		scan = new Scanner(System.in);
		System.out.println("Enter start point number");
		start = scan.nextInt();
		System.out.println("Enter end point number");
		end = scan.nextInt();
		
		for (int i = start; i<=end; i++) {
			
			if (i%2==0) {
				sumEven += i;
				System.out.println("Sum of even numbers is: " + sumEven);
			}
			else {
				sumOdd += i;
				System.out.println("Sum of odd numbers is: " + sumOdd);
			}
			System.out.println();
			
		}
		
		
		
		
		
	}

}
