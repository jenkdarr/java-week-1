package week2.material;

public class JavaWeek2a {

	public static void main(String[] args) {
		//For Loops
		
		//Three items in a for loop: variable initialization;  condition;  increment;
		for(int i = 1; i < 4; i++) {
			//System.out.println("Scoop cup of flour");//Will print out this message
			                                         //four times
			//System.out.println(i);//When i = 0 print out 0123 
			//System.out.println(i);//When i = 1 it will print out 123
		}
		
		for (int i = 1; i <= 10; i++) {  //This will print out 12345678910
			System.out.println(i);
		}
		
        for (int i = 0; i <= 10; i += 2) {  //This will print 246810
        	System.out.println(i);
        }
        
        //To print out even number the if statement would be
        //if (i % 2 == 0)
        //To print out odd number the if statement would be 
        //if (i % 2 == 1)
        
        for (int i = 0; i <=10; i++) {
        	if (i % 2 == 1) {
        		System.out.println(i);
        	}
        }
	   
        int x = 0;
        while (x < 10) {
        	System.out.println(x);
        	x++;
        }
	
	}
	
	

}
