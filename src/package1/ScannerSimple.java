package package1;

import java.util.Scanner;

public class ScannerSimple {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);				// for get the Data from user we must declare Scanner Object First
		
		System.out.println("Enter your Name: "); 		// Print Statement
		String name=s.next();							// use of s.next for get String Type Data
		
		System.out.println("Enter Your Age: ");		    // Print Statement
		String age = s.next();							// use of s.next for get String Type Data
		
		System.out.println("Enter Your Gender: ");  	// Print Statement
		char gender = s.next().charAt(0);				// Character 0 for first word of male or female -
		
		System.out.println("Enter Your Phone Number: ");// Print Statement
		long phoneno = s.nextLong();					// use of s.nextLong for max numeric value Type Data 
		
		System.out.println("********Details*******");	// Print Statement
		
		System.out.println("Name : "+name);				// Print Statement
		System.out.println("Age : "+age);				// Print Statement
		System.out.println("Gender : "+gender);			// Print Statement	
		System.out.println("Phone No. : "+phoneno);		// Print Statement
	
		

	}

}
