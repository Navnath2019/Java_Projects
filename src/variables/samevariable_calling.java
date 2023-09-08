package variables;

public class samevariable_calling {

	static int a = 50;
	int b = 10;
	
	public static void c()
	{
		a = 20;
		System.out.println(a);//20
		
	}
	public void d()
	{
		a = 30;
		System.out.println(a);//30
		c();
		
	}
	public static void main(String[] args) {
		 samevariable_calling sc = new samevariable_calling();
		sc.d();
		c();
		
	}
}
