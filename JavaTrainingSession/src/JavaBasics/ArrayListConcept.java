package JavaBasics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		ArrayList ar = new ArrayList();
		ar.add(100); //0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		ar.add("Tom");//5
		ar.add("Hello")	;//6
		ar.add(12.33);//7
		ar.add('M');//8
		ar.add(600);//9
		
		System.out.println(ar.size());
		
		ar.remove(9);
		System.out.println(ar.size());
		
		
		//to print all the value of ArrayList : for loop
		
		for(int i=0; i<ar.size(); i++) {
			
			System.out.println(ar.get(i));
		}
		
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		
		System.out.println("before remove method"+ ar1);
		ar1.remove(0);
		
		System.out.println("after remove method"+ ar1);
		ar1.clear();
		
		System.out.println("after clear method "+ ar1);
		//ar1.add("Tom"); error
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
		//ar2.add(100); error
		
		// replace data in arraylist
		
		List<String> name = new ArrayList<String>(); 
		name.add("basu"); 
		name.add("raman"); 
		name.add("tom"); 

		name.set(1, "bhai"); 
		System.out.println("ArrayList after replace: " + name);

		
		
	}

}
