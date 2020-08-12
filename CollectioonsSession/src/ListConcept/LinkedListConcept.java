package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		
		
		LinkedList<String> ll = new LinkedList<String>();
		//add
		
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print:
		System.out.println("content of linkedlist:"+ ll);
		
		//addFirst:
		ll.addFirst("naveen");
		
		//addLast:
		ll.addLast("automation");
		
		System.out.println("content of linkedlist:"+ ll);
		
		//get:
		System.out.println(ll.get(0));
		
		//set:
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		// remove first and last element
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist:"+ ll);
		
		// remoove
		
		ll.remove(2);
		System.out.println("content of linkedlist:"+ ll);
		
		// how to print all the value of LinkedList:
		
		//1.for loop
		
		System.out.println("using for loop");
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		
		//2. advance for floop
		System.out.println("using advance for loop");
		for(String str : ll) {
			System.out.println(str);
		}
		
	//3. iterator	
		System.out.println("using iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//4.while loop
		System.out.println("using while loop");
		
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
