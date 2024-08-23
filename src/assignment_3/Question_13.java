/*
13. Program for multiple if else statement(Largest number in 10,20 and 30)
*/
package assignment_3;

public class Question_13 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;

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
