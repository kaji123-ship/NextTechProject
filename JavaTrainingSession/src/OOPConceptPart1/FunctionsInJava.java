package OOPConceptPart1;

public class FunctionsInJava {
	
	//non static method
	//void doesnt return any value
	
	//return type:void
	public void test() { // no input, no output
		System.out.println("test method");
	}
	
	//return type:int
	public int pqr() { // no input, someoutput
		System.out.println("pqr method");
		int a= 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	// return type: String
	public String qa() { //no input,someoutput
		System.out.println();
		String s= "Selenium";
		
		return s;
	}
	
	//s return type :int
	public int division(int x, int y) { // some input , some output
		System.out.println("division method");
		int d = x/y;
		
		return d;
		
	}
	

	public static void main(String[] args) {
		
		 FunctionsInJava obj = new  FunctionsInJava();
		 
		 obj.test();
		 
		 int l = obj.pqr();
		 System.out.println(l);
		 
		 String s1 = obj.qa();
		 System.out.println(s1);
		 
		int div =  obj.division(30, 0); // it gives the ArithmeticException on console(runtime exception)
		System.out.println(div);
		 
		 
		
		
	}

}
