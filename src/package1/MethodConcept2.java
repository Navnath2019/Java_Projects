package package1;

public class MethodConcept2 {
	
		int empNumber = 200;
	
		public static void main(String[] args) {
	
			MethodConcept2 mc2 = new MethodConcept2();
			mc2.printEmpName(100);

	}
					
		public void printEmpName(int empNumber) {
			
		System.out.println("Employee Name is :" + this.empNumber);
		System.out.println("second Eployee Name is :" + empNumber);	 
		}
	
	
}
