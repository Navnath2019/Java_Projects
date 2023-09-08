package variables;

public class Static_V_cunstructor1 {

	int roll;
	String name;
	static String collage = "Aurangabad";
	
	Static_V_cunstructor1(int Student , String Navnath)
	{
		roll = Student;
		name = Navnath;
	}

	public void getResult()
	{
		System.out.println(roll + "  "+ name+ " " + collage );
	}
}
