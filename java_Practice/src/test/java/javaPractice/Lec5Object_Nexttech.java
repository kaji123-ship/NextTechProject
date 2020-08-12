package javaPractice;

public class Lec5Object_Nexttech {

	
	String Car ="BMW";
	int A=10;
	final int b=4;
	
	
	public static void main(String[] args) {
		
		
		
		Lec5Object_Nexttech myobj = new Lec5Object_Nexttech();
		System.out.println(myobj.Car);
		myobj.b=15; //it shows error due to the final keyword
		
		Lec4Array myobj1 = new Lec4Array();
		System.out.println(myobj1.a);
		
		myobj.A=25;
		System.out.println(myobj.A);
		
		
	}

}
