package array_Loop_Logics;

import java.util.Arrays;

public class Sort_Descending_order_Horizontally {

	public static void main(String[] args) {
		int[] a = { 43, 23, 64, 13, 53 };

        int[] d = a;
        Arrays.sort(d);

        // Printing the elements in descending order horizontally (landscape orientation)
        StringBuilder sb = new StringBuilder();
        for (int i = d.length - 1; i >= 0; i--) {
            sb.append(d[i]).append(" ");
        }
        System.out.println(sb.toString());
        System.out.println("Descending Order in Horizontally");

	}

}
