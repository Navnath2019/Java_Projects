package variables;

public class LocalV_within_method {

	public static void main(String[] args) {

	   
		 Mycountry();

	}
 
	public static void Mycountry() {
		
		 String name = "India";
		 String currency = "Rs";
		 String temparature = "25 Degree C";
		 Double population = 1.30; //Crore
		 int areaofIndia= 307713;// Km
		 int languages = 21;
		 
		 System.out.println(name);
		 System.out.println(currency);
		 System.out.println(temparature);
		 System.out.println(population); 
		 System.out.println(areaofIndia);
		 System.out.println("Total Languages in India : " + languages);
	
	}
	
}
