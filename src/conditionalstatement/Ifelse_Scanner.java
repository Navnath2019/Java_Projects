package conditionalstatement;

import java.util.Scanner;

public class Ifelse_Scanner {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter browser name to execute tests: ");			
		String browser = scan.nextLine();
		
		
	if(browser.equalsIgnoreCase("Chrome")){//input (browser) will match with (value-"chrome") then statement will true
			System.out.println("Testing is started on chrome browser");	
			 
	}
		
	
	else if(browser.contains("firefox")) {
		System.out.println("Testing is started on firefox browser");
		
	}
	 
	else if(browser.equals("edge")) {
		System.out.println("Testing is started on edge browser");
	 
		
	}

	else {
		
		System.out.println("provided browser is not available on system Please Select Valid browser Name ");
	


		
	}	
	}	
}	

	

