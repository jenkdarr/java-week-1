package week1.material;

import java.util.Scanner;

public class JavaWeek1 {

	//This is a multiline comment
	/**
	 * Entry point to java application
	 * @param args
	 * 
	 * primitive data types
	 * 
	 * byte -128 up to 127  This is 8 bits
	 * short -32768 up to 32767 This is 16 bits
	 * 
	 * int -2147483648  up to 2147483647 This is 32 bits    
	 * long is a much larger number      This is 64 bits
	 * 
	 * float -3.4028235  up to 3.4028235 This is 32 bits
	 * double is a much larger number    This is 64 bits
	 * 
	 * char is a single character 'A'
	 * boolean-true or false
	 *
	 * Objects
	 * String is like a sentence "This is a string"
	 * 
	 *
	 * operator performs actions on operands
	 * + -  *  /
     * == is equality
     * 
	 */
	
    
	
	public static void main(String[] args) {
		
		int age = 57;
		age = age + 8;
		//The == means that the numbers must be equal to each other
		boolean isAge50 = age == 50; 
		boolean isAge65 = age == 65;
		System.out.println(isAge50); //This will print out false
		System.out.println(isAge65); //This will print out true
		System.out.println(age); //This will print out 65
		
		String firstName = "Louis";
		String lastName = "Benton";
		String fullName = firstName + " " + lastName;//concatenation
		System.out.println("My name is " + fullName);
		
		
		System.out.println("I am learning how to use github.");
		System.out.println("This is way cool!");
		System.out.println("This is " + "way " + "cool! ");
		//variable declaration-type identifier-assignment operator-value-semicolon
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