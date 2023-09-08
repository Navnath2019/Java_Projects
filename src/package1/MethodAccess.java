package package1;                     // Instance Area, Static Area, Static Variable

public class MethodAccess {
	//Instance Variable
	 int netVolume = 200;	
	 static int number = 10;
		public static void main(String[] args) {
		
				//static area
				MethodAccess a = new MethodAccess();//object creation
				System.out.println(a.netVolume);//variable calling
				a.volume();//with the reference of object we have call to volume //method calling 
				
				System.out.println(number);// method-01-we can direct access static variable into static or instance methodS
				System.out.println(a.number);//Method-02 - use static variable by using object(a.)
				System.out.println(MethodAccess.number);//Method-03-we can access static class variable by using class (MethodAccess)
	}
	
		public void volume() {
		
				//instance area
				System.out.println(netVolume);
				
				MethodAccess aa = new MethodAccess();
				
				System.out.println(number);//Method-01- we can direct access class static variable into static or instance methodS
				System.out.println(aa.number);//Method-02 - use class static variable by using object(aa.)
				System.out.println(MethodAccess.number);//Method-03-we can access static class variable by using class (MethodAccess) 
	}			
		

}


