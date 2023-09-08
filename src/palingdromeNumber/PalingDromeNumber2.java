package palingdromeNumber;

import java.util.Scanner;

public class PalingDromeNumber2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
					int no = sc.nextInt(); // take one number 
					
					int temp = no; // store this "no" into "temp" variable" 
					int rev = 0,rem; // for get revers take two variable 1. rev 2. rem
					
					while  (temp !=0 )
					{
						rem = temp%10;
						rev = rev*10 +rem;
						temp=temp/10;
						
					}
					if (no == rev)
					{
						System.out.println("this is Palingdrome Number :"+ no);
					}
					else 
					{
						System.out.println("this in Not Palingdrome Number: "+ no);
					}
		
		
	}
		

}