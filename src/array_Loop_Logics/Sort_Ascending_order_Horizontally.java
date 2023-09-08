package array_Loop_Logics;

import java.util.Arrays;

public class Sort_Ascending_order_Horizontally {

	public static void main(String[] args) {
		int[] a = { 43, 23, 64, 13, 15,53 };

		int[] d = Arrays.copyOf(a, a.length);
        Arrays.sort(d);
        
         System.out.print("Ascending Order in Horizontal: ");
            for (int i = 0; i < d.length; i++) {
                 System.out.print(d[i]);
                 if (i < d.length - 1) {
                     System.out.print(", ");      
                
                
                
                
            }
	

        }   
            
        }           
}
