package variables;

public class Variable_steps {

	int e;
	String b;
	static int d = 20;
	
	public static void e()
	{
		System.out.println("Hello Variable");
	}
	
	public static void main(String[] args) {
		Variable_steps vs = new Variable_steps();
		vs.b = "Selenium";
		vs.e = 10;
		d = 2;
		e();
		
		System.out.println(vs.b + " " + vs.e + " "+ d );
//		System.out.println(vs.b);
//		System.out.println(vs.e);
//		System.out.println(d);
		
	}

}
