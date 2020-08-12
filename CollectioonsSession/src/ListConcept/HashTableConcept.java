package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		// it is similar to hashmap,but is is synchronised (one by one can access)
		// synchronised mean multiple thread cannt access at a one time or thread safe
		// it stores the value on the basis of key-value
		// key--object--hascode--value
		// it doesnt have null key or null value
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "java");
		
		// create a clone copy/shallow copy:
		
		
		Hashtable h2 = new Hashtable();
		
		h2= (Hashtable)h1.clone();
		
		System.out.println("the value from h1"+ h1);
		System.out.println("the value from h2"+ h2);
		
		h1.clear();// clear method
		
		System.out.println("the value from h1"+ h1);
		System.out.println("the value from h2"+ h2);
		
		// contains value:
		
		Hashtable st = new Hashtable();
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if(st.containsValue("Naveen")) {
			System.out.println("value is found");
		}
		
	// 	print all values from hastable using--Enumeration-- elements()
		Enumeration e = st.elements();
		System.out.println("print values from st");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	//get all the values from hashtable using--entrySet()--set of hashtable values:
		System.out.println("print values from st using entry set");
		
		Set s = st.entrySet();
		System.out.println(s);
		
		// compare two object with hascode
		Hashtable st1 = new Hashtable();
		st1.put("A", "Naveen");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium");  // it contains only unique values
		
		st1.put(null, "Selenium"); //(null key) it will give nullpointerException on console
		st1.put("D", null);  //(null value) it will give nullpointerException on console
		
		System.out.println("values from st1:");
		System.out.println(st1);
		
		
		// check both the hashtable are equal or not:
		
		if(st.equals(st1)) {
			System.out.println("both are equal");
		}
		
		
	//get the value from a key:
		System.out.println(st1.get("A"));
		
	// get the hashcode of hashtable object:
		System.out.println("the hashcode value of st1 :"+ st1.hashCode());
		
		
		
		
	}

}
