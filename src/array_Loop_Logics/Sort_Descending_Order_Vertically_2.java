package array_Loop_Logics;

public class Sort_Descending_Order_Vertically_2 {

	public static void main(String[] args) {
		
		int temp = 0;
		int [] a = {8,9,1,3,5,8,4,6,5,2};
		
		for (int i = 0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a [i]< a[j])
				{
					temp = a [i];
					a [i] = a[j];
					a[j] = temp;
				}
				
			}
		}
		for (int i = 0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
		System.out.println("Second Largest Element " + a[1]) ;
		
		
	}

}
