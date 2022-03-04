package week1.material;

public class JavaWeek1b {

	public static void main(String[] args) {
	//JRE is Java runtime environment
	//JVM is Java virtual machine
		String street = "1234";
		String address = " Buffalo Drive";
		System.out.println(street + " address");//This prints out 1234 address because
		                                        //address has the "" marks which makes
		                                        //it a string
		System.out.println(street + address);//This prints out 1234 Buffalo Drive

		String petName = "Fred";
		int myAge = 49;
		char firstLetter = 'A';
		boolean isWinter = false;
		float weight = (float)15.2;
		short heightInInches = 68;
		
		int a = (2*3)+4;
		System.out.println(a);
		
		//Hi there, person
		//You act like a 12-year old!
		//Your hair is orange!
		
		String person = "person";
		String hairColor = "Orange!";
		
		System.out.println("Hi there, " + person);
		System.out.println("You act like a " + (14-2) + "-year old!");
		System.out.println("Your hair is " + hairColor);
		
	}

}
