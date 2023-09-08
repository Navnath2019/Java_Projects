package array_Loop_Logics;

import java.util.Arrays;

public class Sort_Descending_Order_Vertically {

	public static void main(String[] args) {
		//Initializing an array of integer type 
        int  a[] = { 43, 23, 64, 13, 53};
 
         int [] d = a;
         Arrays.sort(d);
 
        // Printing the elements
        for (int i = d.length-1; i>=0; i--)
        {
        	System.out.println(d[i]);
        }
        System.out.println("Descending Order");

	}

}
