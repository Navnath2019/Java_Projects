package palingdromeNumber;

public class PalingDromeNumber1 {

	public static void main(String[] args) {
		
		
		int no = 16461; // take one number 
		int temp = no; // store this "no" into "temp" variable"
		
		int reversNumber = 0;
		int  forwordNumber= 0; // for get revers take two variable 1. rev 2. rem
		
		while  (temp !=0 )
		{
			forwordNumber = temp%10;
			reversNumber = reversNumber*10 +forwordNumber; 
			temp=temp/10;
			
		}
		if (no == reversNumber)
		{
			System.out.println("this is Palingdrome Number :"+ no);
		}
		else 
		{
			System.out.println("this in Not Palingdrome Number: "+ no);
		}
	
	}

}
