package array;

public class Array_MatrixPrint {

	public static void main(String[] args) {

		// Defining MultiDimension Array
		int a[][]= {{1,2,3,7},{4,5,6,8},{7,8,9,6}};// 3by 4 array
		// get Total Number of Rows

		//Rows	
		int rows = a.length;//length is propeerty of array

		System.out.println("Total Rows of Array: " + rows );

		//Columns	 
		int columns = a[0].length;//length is propeerty of array

		System.out.println("Total columns of Array: " + columns);
		
//**************************************************************************
	
		//Matrix Print== requirement outer for loop and inner for loop
		//Outer loop
		for (int i=0; i <rows; i++)
		{
			for (int j=0;j<columns;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
