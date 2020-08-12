package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW(); // static polymorphism or compile time polymorphism
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("*************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("********");
		
		
		//Top casting
		Car c1 = new BMW(); // child class object can be reffered by parent class reference variable --dynamic polymorphism or runtime polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		//c1.theftSafety(); it shows error because only bmw can access
		
		//Down Casting
		BMW b1 =(BMW) new Car(); // compile time it doesnt show error but at the runtime it will give u error/exception i.e ClassCastException
		
	}

}
