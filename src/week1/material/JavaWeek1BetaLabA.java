package week1.material;

public class JavaWeek1BetaLabA {

	public static void main(String[] args) {
		
		//create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 7;
		int purchasedTickets = 2;
		int ticketsLeftOver = availablePlaneSeats - purchasedTickets;
		
		//create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 89.00;
		double impulsePurchase = 2.15;		
		double newCostOfGroceries = costOfGroceries + impulsePurchase;
		
		//create a variable to hold a person's middle initial
		char middleInitial = 'D';		
		middleInitial = 'G';		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean itsHotOutside = false;		
				
	    //create a variable to hold a customer's first name
		String firstName = "Blake";		
		String lastName = "Lewis";		
		//create a variable to hold a street address
		String streetAddress = "1234 Anywhere";	
				
		//print all variables to the console
		System.out.println("The total number of plane seats is " +  availablePlaneSeats);		
				
				
				
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
	    System.out.println("The total number of plane seats after purchase is " + ticketsLeftOver);
	    
				
		//impulse candy bar purchase, add 2.15 to the grocery total
		//costOfGroceries = costOfGroceries + 2.15;
		System.out.println("The new grocery total is $" + newCostOfGroceries);		
				
		//birth certificate was printed incorrectly, change the middle initial to something else
	
		System.out.println("My middle initial should be " + middleInitial + " instead of D.");
				
		//the season has changed, update the hot outside variable to be opposite of what it was
		System.out.println("The temperature is cooling of " + !itsHotOutside);		
				
		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice
		String fullName = firstName + " " + middleInitial + " " + lastName;	
		System.out.println(fullName);		
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("Hello my name is " + fullName + " and I live at " + streetAddress + '.' );		

	}

}
