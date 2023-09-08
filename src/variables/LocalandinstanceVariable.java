package variables;

public class LocalandinstanceVariable {

	//instance variable or global variable
	String name;
	String currency;
	String temparature;
	Double population;
	int areaofMaharashtra;
	
	public static void main(String[] args) {
		
		LocalandinstanceVariable iv = new  LocalandinstanceVariable();
		
		iv.India();
		iv.Japan();
		
	}

	public  void India() {
		
		 name = "India";
		 currency = "Rs";
		 temparature = "25 Degree C";
		 population = 1.30; //Crore
		 areaofMaharashtra = 307713;// Km
		
		
		
		System.out.println(name);
		System.out.println(currency);
		System.out.println(temparature);
		System.out.println(population);
		System.out.println(areaofMaharashtra);
		System.out.println("***************");
	}

	  public  void Japan(){
	  
		  String name = "Japan";
		  String Currency = "Yen";
		  String temparature = "11 Degree C";//degree C
		  double population = 12.57;// population
		  int Literacy = 95;//%
		  
		  System.out.println(name);
		  System.out.println(Currency);
		  System.out.println(temparature);
		  System.out.println(population);
	      System.out.println(Literacy);
		
 }
	  
	

		
	
		
		
	} 
	
	
	
	
	
	
	

