package conditionalstatement;

import java.util.Scanner;

public class SwitchStatement_02 {

	public static void main(String[] args) {
		
		System.out.println("Please Enter Vowels");
		Scanner scan = new Scanner (System.in);
		char alphabet;
		alphabet = scan.next().charAt(0);
		
		
	   
		switch (alphabet)
		{
		case 'a' :
		{
			System.out.println("'a' is vowel");
			break;
		}
		case 'e' :
		{
			System.out.println("'e' is vowel");
			break;
		}
		case 'i' :
		{
			System.out.println("'i' is vowel");
			break;
		}
		case 'o' :
		{
			System.out.println("'o' is vowel");
			break;
					
		}
		case 'u':
		{
			System.out.println("'u' is vowel");
			break;
		}
			default :
		{
			System.out.println("This is not Vowel");
			break;
		}
		
		}
		
}
		
}


