package variables;

public class StaticVariable {
	
	int net = 200;
	int net2 = 300;
	public static void main(String[] args) {
		StaticVariable sv = new StaticVariable();
		sv.IB();
		
		
	}
	private void IB() 
	{
		
		System.out.println(net);
		System.out.println("this is instance block");
	}

}
