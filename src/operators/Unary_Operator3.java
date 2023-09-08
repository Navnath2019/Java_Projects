package operators;

public class Unary_Operator3 {

	public static void main(String[] args) {
		int a = 10; // Local Variable
		int b = 10; // Local Variable
		
		System.out.println(a++); 		// 10,11 (11 is background value )      last value of a= 11
		System.out.println(a++ + ++a);	// 11,12 + 13,13 = 11+13 = 24           last value of a = 13
		System.out.println(b++ + ++b);	// 10,11 + 12,12 = 10+12 = 22			last value of b = 12
		System.out.println(b++ + b++); 	// 12,13 + 13,13 = 12+13 = 25			last value of b = 13
		System.out.println(b);          // 13                                   last value of b = 13
		System.out.println(a++ + b++);  // 13,14 + 14,15 = 13+14 = 27			last value of b = 15
		
		// imp -here considor last value for add
		
		
		

	}

}
