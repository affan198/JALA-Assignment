/*
5. Write a program to print largest number among three numbers.
*/
package assignment_3;

public class Question_5 {

	public static void main(String[] args) {

		int a = 1;
		int b = 3;
		int c = 2;

		if (a >= b && a >= c) {
			System.out.println("greater number is " + a);
		} else if (b >= a && b >= c) {
			System.out.println("greater number is " + b);
		} else if (c >= a && c >= b) {
			System.out.println("greater number is " + c);
		} else {
			System.out.println("not define");
		}

	}

}
