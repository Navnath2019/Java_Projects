package package1;

public class Method_01 {
	
	//We can’t write business / programming logic on class body.

		public static void main(String[] args) {  	//Static Method
		
				System.out.println("We are learning java concept");
				Method_01 mc = new Method_01();// Constructor concept 
				
				mc.add();
		
	
	}

	
		public void  add(){			//instance method
		
				int a; //Declaration
				a = 100; //initialization
				
				int b = 200; //Declaration and initialization
				
				int c;
				c = a+b;  
		
				System.out.println("Addition of a and b : " + c);
				
				Method_01.substract();
				
		
	}
	
		public static void substract(){
		
		int i = 200;
		int j = 100;
		int k = i-j;
		 
		System.out.println("Substraction of i and j is : " + k );
		
		
		
	}
	
	
	
	
}
