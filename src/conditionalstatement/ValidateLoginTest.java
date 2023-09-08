package conditionalstatement;

public class ValidateLoginTest {

	public static void main(String[] args) {
		
		String username = "Navnath2023";
		String Password = "Nkm@123";
		
		if (username.equalsIgnoreCase("Navnath2023") && Password.equals("Nkm@123")) {
			
			System.out.println("Welcome to Home Page");
	}
		else {
			System.out.println("Invalid Credentials, Please try again");
			
		}
		
}
		
}
