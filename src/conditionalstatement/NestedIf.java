package conditionalstatement;

public class NestedIf {

	public static void main(String[] args) {
		//write a program to validate whether candidate is eligible for voting
		//age should be >=18
		//candidates should be maharashtrian 
	
		int waight=49;
		int age = 18;
		
			if (waight>=50) {
				
				if (age>=18){
					System.out.println("candidate waight is allow for Blood Donation");
			}
				else {
					System.out.println("candidate age is not allow for Blood Donation");
					
				}
								
			}
			else {
				System.out.println("candidate waight not allowed for Blood Donation");
			}
}		
}	
		