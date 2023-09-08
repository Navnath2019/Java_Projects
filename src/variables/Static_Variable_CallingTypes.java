package variables;

public class Static_Variable_CallingTypes {

	static int c = 10;
	public static void main(String[] args) {
		
		//System.out.println(c);
		abc();
		d();
		//System.out.println(Static_Variable_CallingTypes.c);
		Static_Variable_CallingTypes.d();
		d(); 
	}
	public static void abc() {
		System.out.println(Static_Variable_CallingTypes.c);
	
		
	}
	public static void d()
	{
		int a = 50;
		System.out.println(a);
		
		
	}
}
