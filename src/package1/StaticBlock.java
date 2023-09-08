package package1;

public class StaticBlock {
	
	
//		static 
	{
		System.out.println("we are larning static block concept");	//Execute-Ist//
	}
	
	{	
		System.out.println("this is instance block");				//Execute-2nd//
	}
	
		// Default constructor : if we do not declare the constructor inside the class then at the time of 
		// compilation Compiler will generate “Zero argument constructor ” with empty implementation

		//public StaticBlock() { //its default constructor 
		//super();
		
		public StaticBlock() {
				
			System.out.println("this is constructor");				//Execute-3rd//
	}
	
		public static void main(String[] args) {
			
			StaticBlock SB = new StaticBlock();
			
			
			
	}

}
