package array_Loop_Logics;

import java.util.Arrays;

public class Sort_Ascending_order_Vertically {

	public static void main(String[] args) {
	
		
			//sort value as ascending order vertically
			int  a[] = { 43, 23, 64, 13, 53};
			 
	        int [] d = Arrays.copyOf(a, a.length);
			// Sorting the array in descending order
	       Arrays.sort(d);
	       
	       System.out.println("Ascending Order in Vertically");  
	       for (int i = 0; i < d.length; i++) {
	            System.out.println(d[i]);
	     
	       

	       }
	}

}
