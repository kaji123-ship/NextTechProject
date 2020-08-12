package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		
	//1. while loop:
		//dis-advantage of while loop:it will generate infinite loop if you dont give increment/decrement part
		
		int i=1; //intialization
		while(i<=10) {  //conditional
			System.out.println(i);
				i++;  // incremental/decremental
		}
		
		System.out.println("***************");
		
		//2.for loop
		
		for(int j=1;j<=10;j++) {
			
			System.out.println(j);
		}
		System.out.println("**************");
		
		for(int k=10;k>=1;k--) { //decremental
			System.out.println(k);
		}
		
		System.out.println("************");
		
		for(int m=10;m>=-10;m--) {
			System.out.println(m);
		}
		
		System.out.println("************");
		
		for(int n=1;n<=10;n++) {
			System.out.println(n);
		}
		
		
		
	}

}
