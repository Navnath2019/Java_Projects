package package1;

import java.util.Scanner;


public class Scanner_Deepak {

	public static void main(String[] args) {
		
		 int count = 0;
	        System.out.println("Deepak");
	        Scanner sc = new Scanner(System.in);
	        String st = sc.nextLine();
	        
	        for (int i=0; i<st.length(); i++) 
	        {
	            char ch = st.charAt(i);
	            if(ch =='a'|| ch =='e' || ch=='i' || ch =='o' || ch =='u') 
	            {
	                // do nothing
	            }
	            else if(ch !=' ')
	            {
	                count++;
	            }
	        }
	        System.out.println("Number of consonants in the given string is " + count);
	    }


}
