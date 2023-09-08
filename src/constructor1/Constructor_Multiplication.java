package constructor1;

public class Constructor_Multiplication {
	
	
	public void user1() {
		
		System.out.println("we are learning cunstructor");
		
	}
	 public Constructor_Multiplication() {
		 
		 int a =20;
		 int b= 30;
		 int c;
		 c = a*b;
		 
		 System.out.println("a+b valu: "+ c);
		 
	 }

	public static void main(String[] args) {
	
		Constructor_Multiplication abc = new Constructor_Multiplication();
		
		abc.user1();
		
	}

}
