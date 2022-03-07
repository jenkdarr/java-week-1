package week2.material;

public class JavaWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Trying to learn more about github and the computer directory");
      
      //Boolean operators
      
      // == equality operator
      System.out.println(3 == 3);//True
      System.out.println(3 > 5);//False
      System.out.println(3 <= 5);//True
      System.out.println(5 <= 5);//True
      System.out.println("Separate code groups.");
      // && and   || or
      System.out.println(true && true);//True
      System.out.println(true && false);//False
      System.out.println(true || false);//True
      System.out.println(false || false );//False
      
      //Conditionals
      
      String name = "Sam";
      
      if (name=="Sam") {
    	  System.out.println("Hello Sam.");//This will print out Hello Sam
      }
      else {
    	  System.out.println("You are not Sam " + name + ".");//This only prints out when the
    	                                                      //if statement is false
    	  
      }
      
      int age = 15;
      
      if (age >= 16) {
         System.out.println("You can get you license.");
	}
      else { 
    	 System.out.println("You are not old enough to get your license.");
      }
      
      double costOfMilk = 3;
      
      if(costOfMilk <= 2) {
    	  System.out.println("Buying two of them.");
      }
      else if (costOfMilk <=3) {
    	  System.out.println("Buying one of them.");
      }
      else {
    	  System.out.println("Not buying any milk today.");
      }
      
      char grade = 'F';
      
      
      
      switch (grade) {
         case 'A':
         System.out.println("90%");
         break;
         
         case 'B':
             System.out.println("80%");
             break;
             
         case 'C':
             System.out.println("70%");
             break;    
      
         case 'D':
             System.out.println("60%");
             break;     
          
         default:
        	 System.out.println("0%");
      
	
	}
	
      if (5==5) {
    	  if (4==4) {
    		  System.out.println("Yes");
    	  }
    	  else {
    		  System.out.println("5 is 5");
    	  }
      //The nested if statement above  (5==5) and (4==4) is the same as 
      //using an if statement     if(5==5 && 4==4) 
    	 
           	if (5==5 && 4==4) {
           		System.out.println("Yes");
           	}
	
}
}	
}