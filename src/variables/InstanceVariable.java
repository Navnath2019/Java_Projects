package variables;

public class InstanceVariable {
	
	//instance variable or global variable
		String name;
		String currency;
		String temparature;
		Double population;
		int areaofIndia;
		int areaofJapan;
	

		public static void main(String[] args) {
		
		InstanceVariable iv = new InstanceVariable();
		
		iv.India();
	}	
		
		public  void India() {
		
		 name = "India";
		 currency = "Rs";
		 temparature = "25 Degree C";
		 population = 1.4; //Crore
		 areaofIndia = 307713;// Km
		
		
		
		System.out.println("Name of Country:- " + name);
		System.out.println("Country Currency :-" + currency);
		System.out.println("Country Temparature :-" + temparature);
		System.out.println("Country Population :-" + population+ "Cr" );
		System.out.println("Country Total Area :-" + areaofIndia+ " SqFt");
		System.out.println("***********************************");
	}

	
	      
		
		
		
	
		
		
	} 
	
	
	
	
	
	
	



	

