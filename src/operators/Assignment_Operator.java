package operators;

public class Assignment_Operator {

	public static void main(String[] args) {
		
		int a = 10; //Local Variable
		
		//increase the value by 3
		a += 3;               //do not pass space between + and =
		System.out.println(a);
		
		a -= 4; //9              //last value of a = 13 so 13-4 = 9
		System.out.println(a);
		
		a *= 2; //18             //last value of a = 9 so 9*2 = 18
		System.out.println(a);
		
		a /= 2; //9              //last value of a = 18 so 18/2 = 9
		System.out.println(a);
		
	}

}
