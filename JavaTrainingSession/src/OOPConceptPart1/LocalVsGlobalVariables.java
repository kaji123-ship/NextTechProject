package OOPConceptPart1;

public class LocalVsGlobalVariables {

	//Global vars-- class variables
	String name = "Tom";
	int age = 25;
	
	public void sum() {
		int i = 15; // Local variables
		int j = 20;
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
	
		int i = 10; // local variables for main method
		System.out.println(i);
		 LocalVsGlobalVariables obj = new  LocalVsGlobalVariables ();
		 System.out.println(obj.name);
		 System.out.println(obj.age);
		obj.sum();
		
	}

}
