package javaPractice;

public class Lec4Array {
 int a = 5;
	public static void main(String[] args) {
		
		
		
		int[] num= {1,2,3,4,5};
		//System.out.println(num[0]);
		
		int[] oddnum= {1,3,5,7,9};
		
		String[] fruits = {"apple", "orange","banana","mango"};
		fruits[0] = "Dragonfruits";
		
		System.out.println(fruits[0]);
		System.out.println(fruits[2]);
		
		//change mango to watermelon
		
		
		fruits[3]="watermelon";
		System.out.println(fruits[3]);
		
		
		//Array Length
		System.out.println(fruits.length);
		
		
		System.out.println("************");
		//Loop through an Array
		String[] cars = {"volvo","BMW","Food","Mazda"};
		
		for(int i=1;i< cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("**********");
		
		// print bmw and mazda
		
		
		 for(int i=1;i<cars.length;i+=2) {
			 
			 System.out.println(cars[i]);
		 }
		
		
		
		
		
		
		
		
		
		
	}

}
