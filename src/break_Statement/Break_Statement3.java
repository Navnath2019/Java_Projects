package break_Statement;

public class Break_Statement3 {

	public static void main(String[] args) {
		
		int i= 1;//Local Variable

		while (i<=5)
		{
			if (i==3) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
	}

}
