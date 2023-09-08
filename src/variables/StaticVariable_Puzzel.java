package variables;

public class StaticVariable_Puzzel {

	int a = 100;
	static int b = 200;
	
	public static void main(String[] args) {
	
		StaticVariable_Puzzel sv1= new StaticVariable_Puzzel();		//object-01
		System.out.println(sv1.a);
		System.out.println(sv1.b);
		sv1.a = 1000;
		sv1.b = 2000;
		System.out.println(sv1.a);
		System.out.println(sv1.b);
		
		System.out.println("************sv2**************");
		
		StaticVariable_Puzzel sv2 = new StaticVariable_Puzzel();	//object-02
		System.out.println(sv2.a);
		System.out.println(sv2.b);
		sv2.a = 300;
		sv2.b = 400;
		System.out.println(sv2.a);
		System.out.println(sv2.b);
		
		
		System.out.println("**********sv3*****************");
		
		StaticVariable_Puzzel sv3 = new StaticVariable_Puzzel();	//object-02
		System.out.println(sv3.a);
		System.out.println(sv3.b);
		sv3.a = 1500;
		sv3.b = 400;
		System.out.println(sv3.a);
		System.out.println(sv3.b);
		
	}

}
 