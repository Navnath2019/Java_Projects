package array_String_Charector_Loop;

import java.util.Arrays;


public class Alphabetically_SingleName {

	public static void main(String[] args) {
		
		String name = "navnath";
        String asc = sortStringInAscendingOrder(name);
        System.out.println("Original String: " + name);
        System.out.println("Sorted String in Ascending Order: " + asc);
    }

    public static String sortStringInAscendingOrder(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
		
		
		
		
	}

}
