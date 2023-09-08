package array;

public class MultidimantionArray {

	public static void main(String[] args) {
	
		// single Dimension--Datatype ArrayName [] = {v1,v2,v3,v4,v5}
		// MultiDimansion Array--Datatype [][] ArrayName  = {{v1,v2,v3,v4,v5},{v6,v7,v8,v9,v10}}
		// Declaration-- 	int [] numbers = {1,2,3,4,5};
						// System.out.println(numbers[0]); 
		
					//MultiDimansion Array 
					//1st Way
		
		int [][] table =  {{1,2,3,4,5},{6,7,8,9,10}};
		
	
		for (char row = 0; row<2; row++) //row hear we have 2 row {1,2,3,4,5}
		{														 //{6,7,8,9,10}
			for (char column=0;column<5;column++)//column 
			{
			System.out.print(table[row][column]+ " ");	
			}
			System.out.println();
		}
		
	}

}

