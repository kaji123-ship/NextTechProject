package OOPConceptPart2;

public class BMW extends Car { // "has a relationship"

	
	// when same method is present in parent class as well as in the child class with the same name and same number of arguement is called method overriding
	public void start() {  // overriden method
		System.out.println("BMW start");
	}
	
	public void theftSafety() {
		System.out.println("BMW theftsafety");
	}
	
}
