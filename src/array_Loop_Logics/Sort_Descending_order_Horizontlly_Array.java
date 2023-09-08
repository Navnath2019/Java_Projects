package array_Loop_Logics;

import java.util.*;


public class Sort_Descending_order_Horizontlly_Array {

	public static void main(String[] args) {
		//Initializing an array of integer type 
        Integer a[] = { 43, 23, 64, 13, 53};
 
         Integer[] d = a;
		// Sorting the array in descending order
        Arrays.sort(d, Collections.reverseOrder());
 
        // Printing the elements
        System.out.println(Arrays.toString(d));
        System.out.println("Descending Order in Horizontlly array");
	}
	
}
