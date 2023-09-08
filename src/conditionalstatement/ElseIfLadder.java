package conditionalstatement;

import java.util.Scanner;

public class ElseIfLadder {

			public static void main(String[] args) {			
				
				Scanner school = new Scanner(System.in);		
				System.out.println("Enter Student marks :");	
				int marks = school.nextInt();                  
				
			    if(marks>=90 && marks<100){  					
			    	System.out.println("Grade- A");				
																
				}
				else if (marks>=80 && marks<90) {				
					System.out.println("Grade-B");				
				
				} 
				else if (marks>=60 && marks<80) {				
					System.out.println("Grade-C");				
					 
				} 
				else if(marks>=35 && marks<60) {
					System.out.println("Grade-D");
					
				}
				else if(marks<35) {
			    	System.out.println("Fail");
			    }
				else
				{
					System.out.println("Valid Entry ");					
				}
			    
}

					
}
	
						
				
		

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				