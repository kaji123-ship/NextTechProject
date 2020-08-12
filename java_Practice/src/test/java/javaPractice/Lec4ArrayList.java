package javaPractice;

import java.util.ArrayList;

public class Lec4ArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String>cars= new ArrayList<String>();
		cars.add("BMW");
		cars.add("Ford");
		
		System.out.println(cars);
		
		//how to change or replace value in ArrayList
		cars.set(1, "Hummer");
		
		System.out.println(cars);
		
		// remove
		cars.remove("Hummer");
		System.out.println(cars);
		
		// to get the arraylist size
		cars.size();
		System.out.println(cars.size());
		
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
	
		
		ArrayList <Integer> num= new ArrayList <Integer> ();
		num.add(1);
		num.add(3);
		num.add(5);
		num.add(9);
		
		num.set(2, 6);
		System.out.println(num);
		
		System.out.println("***********");
		
		num.remove(3);
		System.out.println(num);
		
		System.out.println("************");
		
		num.size();
		System.out.println(num.size());
		
		System.out.println("**********");
		
		for(int i=0;i<num.size();i++) {
			System.out.println(num.get(i));
		}
	}

}
