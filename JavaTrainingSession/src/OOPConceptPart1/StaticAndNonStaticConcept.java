package OOPConceptPart1;

public class StaticAndNonStaticConcept {

	//global vars: the scope of global vars will be avaible across all the functions with some conditions.	
	
	String name = "Tom"; // non static global vars
	static int age = 25; // static global vars
	
	public void sendMail() {  // non static method
		System.out.println("send mail method");
	}
	
	public static void sum() {  // static method
		System.out.println("sum method");
	}
	
	
	public static void main(String[] args) {
		// how to call  static method and vars ?
		
		//1.direct calling:
		sum();
		
		//2.calling by classname:
		 StaticAndNonStaticConcept.sum();
		 
		System.out.println(age); 
		System.out.println( StaticAndNonStaticConcept.age);
		 
		 // how to call non static method and vars:
		
		 StaticAndNonStaticConcept obj = new  StaticAndNonStaticConcept();
		 obj.sendMail();
		 System.out.println(obj.name);
		 
		 //can i access static methods and vars by using object reference ? yes
		 obj.sum(); // warning will be given and not good way to practice
		System.out.println(obj.age);
	}

}
