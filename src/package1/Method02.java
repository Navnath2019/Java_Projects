package package1;

import java.util.Scanner;

public class Method02 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please Enter Number"); 
			int num1;
			num1 = scan.nextInt();//value will stored under the num11
			System.out.println("you enterd:" +num1);
			
			System.out.println("Please enter Second number");
			int num2;
			num2 = scan.nextInt();//value will stored under the num2
			System.out.println("you enterd:" +num2);
			
			
			Method02 mc1 = new Method02();
			
			//mc1.add();
			//mc1.login();
			
			mc1.addition(num1,num2);
			
			//mc1.crmlogin("Demo", "Demo@123"); //User 1
			//mc1.crmlogin("Admin","Admin@111");
		/*
	} 
			
		public void add() {
		
			int a;
			a= 10;
			int b;
			b = 20;		
			int c;
			c = a+b;		
			System.out.println("Addition of a & b is :" + c );
	
	}
	
		public void login() {
		
			String username =("Navnath");
			String password =("Navnath@123");
			System.out.println("user click on login button");
			System.out.println("user is redirected to HomePage");		
			System.out.println("***********************");
			*/
	}
		
		public void addition(int a, int b) {
		
			int c = a+b; //0+0
			
			System.out.println(c);//0
			System.out.println("addition of number1 and number2 is:" + c);
			System.out.println("***********************");
			
			
		
			
			/*
	}
		
		public void crmlogin(String username,String password) { //method declaration
			
			//method implementation
			System.out.println("user log in successfully");
			
			*/
		}
		 	
	
	
}

