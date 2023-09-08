package conditionalstatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
			
			System.out.println("please select option");
			System.out.println("1.Account Details");
			System.out.println("2.Credit card Details");
			System.out.println("3.Loan Offer Details");
			System.out.println("4.customer care");
			Scanner scan = new Scanner (System.in);
			int option = scan.nextInt();
		   
			switch (option) 
			{
			case 1 :
			{
				System.out.println("user can see account details now");
				break;
			}
			case 2 :
			{
				System.out.println("user can see credit card details now");
				break;
			}
			case 3 :
			{
				System.out.println("user can see loan offer details now");
				break;
			}
			case 4 :
			{
				System.out.println("user can be connected with CC");
				break;
			}
			
			}
			 
			
			
		
         
	

}
}