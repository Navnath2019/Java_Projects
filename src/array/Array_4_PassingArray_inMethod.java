package array;

public class Array_4_PassingArray_inMethod {
	
	static int c[] = {22,2,44,5};

	public static void passingArraytoinMethod(int c[] ) {
		
		int b = c[0];//22
		
		for(int i=0; i<c.length;i++)
		{
			if(b >= c[i])
			{
				System.out.println(b);
			}
			else 
			{
				System.out.println("ABCD");
			}
		}
	}
	public static void main(String[] args) {
		
		passingArraytoinMethod(c);
		
	}
	
	
	
	
	
	
	
	
	

}
