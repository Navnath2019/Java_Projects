package variables;

public class LocalVariablescop2 {

	public static void main(String[] args) {
		
		int qty;
		qty = 10;
						
		/* 1. Local Variable must be initialize after declare Variable (a=10;) inside the method
		   2. Local Variable scope- is only inside the method 
		   3. there are two methods for declare Local variable 
				 1.DataType variable;
				   variableName = value
				   
				  2. DataType variableName = value;
		*/
		System.out.println("qty is:" + qty);
		
		product();

	}

		//local variable-2 scope- within the method
	public static void product(){
		
		int quantity = 100;
		
		
		System.out.println(quantity);
		
				
		
	}
	
	
	
	
}
