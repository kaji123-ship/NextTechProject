package javaPractice;

import java.util.HashMap;

public class Lec5HashMap {

	public static void main(String[] args) {
		
		
		HashMap<String,String> capitalCities= new HashMap<String,String>();
		
		capitalCities.put("Bangladesh", "Dhaka");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		
		System.out.println(capitalCities);
		System.out.println(capitalCities.size());// size of hashmap
			
		capitalCities.get("Bangladesh");
		capitalCities.remove("Germany"); // remove method
		
		System.out.println("after removing the germany"+ capitalCities);
		capitalCities.clear(); // clear method
		
		System.out.println("after clear method "+ capitalCities );

		System.out.println(capitalCities.get("Bangladesh"));
		
	}
	
}
