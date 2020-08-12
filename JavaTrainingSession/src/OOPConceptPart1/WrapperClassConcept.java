package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		
		String x = "100";
		System.out.println(x+20);
		
		// data conversion: String to int
		int i= Integer.parseInt(x);
		System.out.println(i+20);
		
		
		// String to double conversion:
		
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		
		//String to boolean:
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		// int to String conversion
		int j = 200;
		System.out.println(j+20);
		
		String s = String.valueOf(j); //"220"
		System.out.println(s+20);
		try {
		String u = "100A"; // this is not pure numeric value so it will give NumerFormatException
		Integer.parseInt(u);
		}catch(Throwable e) {System.out.println("catching exception");}
		
	}

}
