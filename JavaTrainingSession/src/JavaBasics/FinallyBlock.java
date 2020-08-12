package JavaBasics;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		division();
	}
	
	
	public static void division() {
	int i = 10;
	try {
		System.out.println("inside try block");
		int k = i/0;
	}
	catch(ArithmeticException e) {
		System.out.println("inside catch block");
	}
	finally {
		System.out.println("execute this code even after any exception");
	}
		
	}

}
