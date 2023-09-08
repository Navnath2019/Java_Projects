package constructor1;

public class Constructor {


	// the variable which is declare inside class but outside method, constructor instance block and static block 
	//the scope of instance variable is within class inside all method,constructor,instance and static blocks
	//instance variable-Global Variable
		int branchcode;
		public Constructor() {
			branchcode = 2250;
	}
		public static void main(String[] args) {
	
				Constructor xyz = new Constructor();
				System.out.println(xyz.branchcode);
				xyz.Department(); //output will be =2222;
	}
		public void Department() {
				branchcode = 2222;
				System.out.println(branchcode);
	}
		
	
}
