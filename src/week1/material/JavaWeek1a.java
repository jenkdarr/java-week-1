package week1.material;

public class JavaWeek1a {
	//This is a multiple line comment 
	/**
	 * Entry point to Java applicataion.
	 * Price of Jeep soft top-double
	 * Account balance on debit card
	 * Tire size in inches-integer
	 * Weight of Jeep-integer 3970
	 * Direction I am getting lost in -char
	 * Last known location-String
	 * Engine size in liters-float
	 */
	public static void main(String[] args) {
		double jeepSoftTopPrice = 1500.00;
		double debitCardAccountBalance = 2000.00;
		int tireSize = 35;
		int weightOfJeep = 3970;
		char lostDirection = 'E';
		String lastKnownLocation = "Moab, UT";
		float engineSize = 2.0F;
		double weightOnEachTire = weightOfJeep / 4.00;
		
		debitCardAccountBalance = debitCardAccountBalance - jeepSoftTopPrice;
		//This string format will make the dollar amount look like 500.00 instead
		//of 500.0
		String balance = String.format("%.2f", debitCardAccountBalance);
		System.out.println("I have $" + balance + " left after buying a soft top.");
		System.out.println("Weight on each tire is " + weightOnEachTire);
		System.out.println("I got lost going " + lostDirection + " from " + lastKnownLocation);
	}

}
