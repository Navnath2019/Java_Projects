package conditionalstatement;

public class If_Else4_Nested_If {

	public static void main(String[] args) {
		
		int age = 30; // Local Variable
		int waight = 55; // Local Variable
		
		//Outer if Block
		if(age > 18)
		{
			System.out.println("Age is Elligible");
			//inner if block
			if (waight > 60)
			{
				System.out.println("All Eligible");
			}
			else 
				System.out.println("waight Not Eligible");
			}
			else
			{
				System.out.println("age is not greater than 18");
			}
		
		
		
		
		

	}

}
