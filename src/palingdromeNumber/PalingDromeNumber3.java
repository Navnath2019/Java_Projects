package palingdromeNumber;

import java.util.Scanner;

public class PalingDromeNumber3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int num = sc.nextInt(); // user enter number store into "num" variable
		int originalNum = num; // and "num" store into "originalNum" 
	//======================================================		
		// now reverse the number which user enter 
		//rever number ligic
		
		int rev = 0;
		while (num !=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		
		System.out.print(rev);
		
		
		
		
		
		
	}
		

}