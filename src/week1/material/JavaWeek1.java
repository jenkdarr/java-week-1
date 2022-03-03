package week1.material;

import java.util.Scanner;

public class JavaWeek1 {

	
	/**
	 * Entry point to java application
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("I am learning how to use github.");
		System.out.println("This is way cool!");
		System.out.println("This is " + "way " + "cool! ");
		
		int myAge = 49;
		double cashOnHand = 45.00;
		
		//This turns the double into a decimal with two places
		String cash = String.format("%.2f", cashOnHand);
		
		
		System.out.println("I am " + myAge + " years old.");
		System.out.println("I have $ " + cashOnHand); //prints out I have $45.0
		System.out.println("I have $ " + cash); //prints out I have $45.00
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter something: ");//user puts in information
		String line = sc.nextLine();
		System.out.println("line: " + line);//whatever user puts in the previous line will show up on the 
		                                    //console
		
		

	}

}