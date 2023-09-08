package constructor2;

public class Constructor1 {

	int id; // Global Variable
	String name; // Global Variable
	String address; // Global Variable

	Constructor1()
	{
		System.out.println("This is Default Cunstrucor");
	}


	// Parameterized Constructor
	Constructor1(int a, String b, String c) {
		this.id = a;
		name = b;
		address = c;
	}
	// Non Static Method
	public void displayInfo() {
		System.out.println(id + name + " " + address);
	}

	public static void main(String[] args) {

		// Default Constructor
		Constructor1 c2 = new Constructor1();
		// Parameterized Constructor

		Constructor1 c3 = new Constructor1(1,"John", "London");
		c3.displayInfo();

		Constructor1 c4 = new Constructor1(2, "Alex", "London");
		c4.displayInfo();
		
	}
}
