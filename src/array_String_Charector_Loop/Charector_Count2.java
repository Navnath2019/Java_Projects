package array_String_Charector_Loop;

public class Charector_Count2 {

	public static void main(String[] args) {
		String string = "The best of both worlds";
		int count = 0;
		//Counts each character except space
		for (int i = 0; i < string.length(); i++) {
		if (string.charAt (i) != ' ')
		count++;
		}
		System.out.println(count);
	}

}
