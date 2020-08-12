package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//HashMap is a class implements Map Interface 
		//it extends AbstractMap
		//it contains only unique elements
		// it stores the values key value pair
		// it may have one null key and multiple null values
		// it maintains no order
		// hashmap is non synchronised-- not thread safe means multiple thread can attack at the same time
		// and it so fast then hashtable
		//problem : concurrent modification exception-- fail fast condition
		
	HashMap<Integer,String>	hm = new HashMap<Integer,String>(); 
		hm.put(1, "selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4)); // it will give null value
		
		for(Entry m : hm.entrySet()) {
			
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		
		
		System.out.println("before remove"+ hm);
		hm.remove(3);
		
		System.out.println("after remove "+ hm);
		
		
		// how to store object
		
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("tom",25,"admin");
		Employee e2 = new Employee("peter",26,"QA");
		Employee e3 = new Employee("Steve",27,"Dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the hashmap
		for(Entry<Integer,Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e= m.getValue();
			System.out.println("Employee "+ key + "Info:");
			
			System.out.println(e.name + " "+ e.age+" "+ e.dept);
		}
		

	}

}
