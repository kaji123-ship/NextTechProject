package javaPractice;

public class Lec3IfElseCondition {

	public static void main(String[] args) {

		/*
		 * some comparison operators == is equals to != not equal to < is less than > is
		 * greater than <= is less than or equal to >= greater than or equal to
		 * 
		 * conditions:
		 * 
		 * if- specify a block of code to be executed when the condition is true else-
		 * specify a block of code to be executed if the same condition is false
		 */

		if (50 > 20) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}

		int num10 = 10;
		int num11 = 12;

		if (num10 < num11) {

			System.out.println("the condition is True");

		} else {

			System.out.println("the condition is False");
		}
		
		int tom=100;
		int harry=100;
		
		
		if(tom==harry) {
			System.out.println("today is a sunday");
		}else {
			System.out.println("today is  monday");
		}
		
		
		
		
		

	}

}
