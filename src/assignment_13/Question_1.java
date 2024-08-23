/*
1. Write two methods with the same name but different number of parameters of same type 
and call the methods from main method
*/
package assignment_13;

public class Question_1 {

	public static void main(String[] args) {

		int square = calculate(4);
		System.out.println(square);
		int sum = calculate(2,4);
		System.out.println(sum);
	}
	
	
	public static int calculate(int a) {
		System.out.print("square of "+a+" is : ");
		return a*a;
	}
	public static int calculate(int a, int b) {
		System.out.print("sum of "+a+" and "+b+ " is : ");
		return a+b;
	}

}
