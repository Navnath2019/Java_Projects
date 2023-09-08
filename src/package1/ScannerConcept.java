package package1;

import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter Number"); 
		int num1;
		num1 = scan.nextInt();//value will stored under the num1
		System.out.println("you enterd:" +num1);
		
		System.out.println("Please enter Second number");
		int num2;
		num2 = scan.nextInt();//value will stored under the num2
		System.out.println("you enterd:" +num2);
		
		ScannerConcept scn = new ScannerConcept();
		scn.addition(num1, num2);
		
		//to perform login
		String username;
		String password;
		System.out.println("Please enter username");
		username = scan.next();
		System.out.println("Please enter password");
		password = scan.next();
		
		
		 
		scn.crmlogin(username, password);
		
		
		
		

	}
		public void addition(int a, int b) {
			
		int c = a+b; //0+0
		
		System.out.println(c);//0
		System.out.println("addition of number1 and number2 is:" + c);
		System.out.println("***********************");
		
		
	}
		public void crmlogin(String username,String password) { //method declaration
			
			//method implementation
			System.out.println("user log in successfully");
		
		
			
			
}
}