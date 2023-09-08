package package1;

public class InstanceBolock2 {

	public static void main(String[] args) {
		
		InstanceBolock2 ib1 = new InstanceBolock2();
		InstanceBolock2 ib2 = new InstanceBolock2();
		
		new InstanceBolock2().Demo(); 
		
	}
	
		//Excecution order will top to bottome 
	{
		System.out.println("This is first insatance Block ");
	}
	
	{
		System.out.println("This is Second insatance Block ");
	}
	
	{
		System.out.println("This is Third insatance Block ");
	}
	
	public void Demo()
	{
		System.out.println("this is demo method ");
	}
}

