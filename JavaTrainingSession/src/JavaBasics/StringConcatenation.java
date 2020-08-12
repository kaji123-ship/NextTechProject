package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		//+ : is a concatenation operater
		// println- is used to print on the console with  a new line
		// print- is used to print on the console
		
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "world";
		
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		
		System.out.println("the value of a is:"+ a);
		System.out.println("the value of a and b is:"+(a+b));
		
		System.out.print("Hello Selenium");
		System.out.println("Hello Testing");
		System.out.print("Hello Selenium");
		
		
		
	}

}
