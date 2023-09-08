package operators;

public class Logical_Operator2 {

	public static void main(String[] args) {
		
		int a = 10; //Local Variable
		int b = 5;  //Local Variable
		int c = 11; //Local Variable
		
		//Logical Operator
		System.out.println(a < b && a++< c); //False
		//if first condition false then second condition will not execute 
		System.out.println(a);//10 
		
		
		//Bitwise Operator
		System.out.println(a > b & a++ < c); //False || Println will first print a(10) then ++
		System.out.println(a);//11  
		// Bitwise operator check both condition 
		
		
		
		
		
		
		
		
		
		
		

	}

}
