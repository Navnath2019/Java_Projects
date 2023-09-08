package constructor2;

public class Constructor2 {

	// Constructor Overloading
	Constructor2() {
		System.out.println("No arg constructor");
	}
	Constructor2(int a) {
		System.out.println("int arg constructor");
	}
	Constructor2(String b) {

		System.out.println("String arg constructor");
	}
	public static void main(String[] args) {
		Constructor2 c3 = new Constructor2();
		Constructor2 c4 = new Constructor2(1);
		Constructor2 c5 = new Constructor2("Hello");
	}

}
