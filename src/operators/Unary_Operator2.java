package operators;

public class Unary_Operator2 {

	public static void main(String[] args) {
		
		int a = 10; //Local Variable
		int b = 10; //Local Variable
		// IMP pick the first one for adition value
		System.out.println(a++);       // 10,11 				 
		System.out.println(a++ + ++a); // 11,12 + 13,13					// 1st intial value 11,13
		System.out.println(a + a++);   // 13,+1314	= 13+13				// 1st intial value 13,13
		System.out.println(b++ + b--); // 10,11 + 11-1= 10+11= 21		// 1st intial value 10,11															
		System.out.println(b++ + b--); //10,11 + 11-1 = 10+11= 21		// 1st intial value 10,11				
		System.out.println(b);		   //10								// last remain value of b=10
	}

}
