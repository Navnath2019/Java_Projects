package constructor1;

import java.util.Scanner;

public class Constructor002 {

		public Constructor002() {
			System.out.println("Constructor Without parameter");
		}
		public Constructor002(int x) {
			System.out.println("constructor with any parameter");	
		}
		public Constructor002(int num1, int num2) {
		int c;
		c = num1+num2;
		
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 1st number:");
		int a = scan.nextInt();
		System.out.println("Please enter 2nd number");
		int b = scan.nextInt();
		
		Constructor002 abc = new Constructor002(a,b);
		
		
		
		
		
		
	}
	
	
	
	

}
