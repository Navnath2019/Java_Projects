package loopingstatements;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int [] numbers = {10,20,30,40,50,60,70,80,90,100};
		
		//no of array-10
		//0-9
		for (int i =0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		String countryName [] = {"India","Nepal","Bhutan","Shrilanka"};
		
		for (String Name : countryName) 
		{
			System.out.println(Name);
		}
			System.out.println("we are learning for Each Loop ");
		
			ArrayList list = new ArrayList ();
			
			list.add("Mike");
			list.add(10);
			list.add(countryName);
			
	
	
	}	
	
}			
		