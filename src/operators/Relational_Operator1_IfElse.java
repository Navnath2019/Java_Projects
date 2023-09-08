package operators;

public class Relational_Operator1_IfElse {

	public static void main(String[] args) {
		
//Number Comparision

		int a = 300; // Local Variable
		int b = 300; // Local Variable
		

		if (a != b)
		{
			System.out.println("a is not equall to be ");
		}
			else
		{
				System.out.println("a is equal to be ");
		}
//***********************************************************************		
// String Comparision - 2nd way case sensetive  

		String p = "HELLO";
		String q = "hello";
		
		if (p != q)
		{
			System.out.println("HELLO is not equal to hello");
		}
		else 
		{
			System.out.println("HELLO is equal to hello");
		}
//************************************************************************	
// String Comparision - 2nd way case sensetive  	
	//|| case sensetive  ||
		String c = "HELLO";
		String d = "hello";
		
		if (c == d)
		{
			System.out.println("c and d are equal for 1st way");
		}
		else 
		{
			System.out.println("c and d are not equal for 1st way");
		}
		
//*****************************************************************************
		
// String Comparision - 2nd way case sensetive  	
	//|| case sensetive  ||
		
		if (c.equals(d))
		{
			System.out.println("c and d are equal for 2nd way");
		}
		else 
		{
			System.out.println("c and d are not equal for 2nd way");
		}
		
//*************************************************************************
		
// String Comparision - 2nd way case sensetive  	
//	|| case sensetive  ||
		if (c.equalsIgnoreCase(d))
		{
			System.out.println("c and d are equal for 3rd way");
		}
		else 
		{
			System.out.println("c and d are not equal for 3rd way");
		}
		
//*************************************************************************
		
		
		
		
		
	}

}
