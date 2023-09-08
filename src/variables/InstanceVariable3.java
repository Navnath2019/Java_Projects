package variables;

public class InstanceVariable3 {
	
	String name;
	String company;
	int netWorthin_Billion_$;
	String designation;
	

	public static void main(String[] args) {
		
		InstanceVariable3 Top = new InstanceVariable3();
		
		Top.businessman01();
		Top.businessman02();
		
	}

		public void businessman01() {
		
			name = "Elon Musk";
			company = "Spece-x";
			netWorthin_Billion_$ = 164;
			designation = "CEO";
			
			System.out.println(name);
			System.out.println(company);
			System.out.println(netWorthin_Billion_$);
			System.out.println(designation);
			System.out.println("***************");
	}
	
		public void businessman02() {
			
			name = "Ratanji Tata";
			company = "TCS";
			netWorthin_Billion_$ = 170;
			designation = "CEO";
			
			System.out.println(name);
			System.out.println(company);
			System.out.println(netWorthin_Billion_$);
			System.out.println(designation);
			
		} 
}
