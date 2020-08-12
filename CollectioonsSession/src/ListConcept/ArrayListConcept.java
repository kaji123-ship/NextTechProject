package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
	int a[]	= new int[3];// static array--size fixed
	
	//dynamic array--ArrayList
	//1. can contain duplicate values/elements
	//2. maintain insertion order
	//3. it is not synchronized so arraylist is slow in compare to other collection
	//4. it allows random access to fetch the element because it stores the values on the basis of index
	
	
	ArrayList ar = new ArrayList();
	ar.add(10);//0
	ar.add(20);//1
	ar.add(30);//2
	
	System.out.println(ar.size());
	
	ar.add(40);//3
	ar.add(50);//4
	ar.add(50);//5 duplicate value
	
	System.out.println(ar.size()); // size of arrayList
	
	System.out.println(ar.get(4)); // to get the value from an index
	
		//to print all the values from arrayList:
		//1.for loop
		//2.using iterator
	
	
	for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}

	
	//non generic vs generic:
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
	ar1.add(100);
	//ar1.add("selenium"); it is not allow to write string value
	
	ArrayList<String> ar2 = new ArrayList<String>();
	ar2.add("test");
	ar2.add("selenium");
	
	//ArrayList<E> ar3 = new ArrayList<E>(); this one use when we dont know abt what the datatype
	
	// Employee class objects:
	
	Employee e1 = new Employee("Naveen",27,"QA");
	Employee e2 = new Employee("tom",28,"Dev");
	Employee e3 = new Employee("peter",29,"admin");
	
	ArrayList<Employee> ar4 = new ArrayList<Employee>();
	ar4.add(e1);
	ar4.add(e2);
	ar4.add(e3);
	
	// iterator to traverse the value
	Iterator<Employee> it =ar4.iterator();
	while(it.hasNext()) {
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
	}
	System.out.println("************");
	//addAll()
	ArrayList ar5 = new ArrayList();
	ar5.add("test");
	ar5.add("selenium");
	ar5.add("QTP");
	
	ArrayList ar6 = new ArrayList();
	ar6.add("dev");
	ar6.add("java");
	ar6.add("javaScript");
	
	ar5.addAll(ar6);  //addAll method
	for(int i=0; i<ar5.size(); i++) {
		
		System.out.println(ar5.get(i));
	}
	// removeAll()
	System.out.println("*************");
	
	ar5.removeAll(ar6); //removeAll method
for(int i=0; i<ar5.size(); i++) {
		
		System.out.println(ar5.get(i));
	}
	
System.out.println("**********");
	//retainAll() it is print to common value(test is a common value)

ArrayList ar7 = new ArrayList();
ar7.add("test");
ar7.add("selenium");
ar7.add("QTP");

ArrayList ar8 = new ArrayList();
ar8 .add("test");
ar8.add("java");

ar7.retainAll(ar8);  // retainAll method
for(int i=0; i<ar7.size(); i++) {
	
	System.out.println(ar7.get(i));
}

ar7.clear();  // clear method
ar7.remove(2); // remove method







	}

}
