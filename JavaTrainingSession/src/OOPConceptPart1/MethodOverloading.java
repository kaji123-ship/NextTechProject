package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
		
		//we can overload main method also.
		//you cannot create a method inside a method.
		//duplicate method -- i.e same method name with same number of arugements are not allowed
		
		
		// method overloading -- when the method name is same with different arguments or input paramaters within the same class.
		
	}

	
	public static void main(int p) {
		
	}
	
	public static void main(String p) {
		
		
	}
	
	
	public void sum() {
		System.out.println("sum method with zero params");
	}
	
	public void sum(double d) {
		System.out.println("sum method with one params");
	}
	
	public void sum(int k, int l) {
		System.out.println("sum method with 2 params");
	}
	
	public void sum(int m , String h) {  // data type should not be same
		
	}
	
	
	
}
