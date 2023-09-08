package variables;

public class InstanceVariable2 {
	
	int a; //also we can refer as int x,y,z; 
	int b;
	int c;
	
	
		public static void main(String[] args) {
		
			InstanceVariable2 ab = new InstanceVariable2();
			
			ab.addition();
			ab.Multiplication();
		
	}
		// Addition of two numbers 12 Byte
		public  void addition() {
			
			a = 10;
			b = 20;
			c = a+b;
		System.out.println(c);
		
	}
		 
		// Multiplication of two numbers 12 Byte
			
		public  void Multiplication () {
				
			a = 30;
			b = 10;
				
			
			c = a * b;
			System.out.println(c);
			
				
	}
			
			
			
		
	    
		
		
		
		
		
}
