/*
4. Write a program to find the two numbers equal or no
*/
package assignment_2;

public class Question_4 {

	public static void main(String[] args) {

		int a = 4;
		int b = 3;

		System.out.println(areEquals(a, b));

	}

	public static String areEquals(int num1, int num2) {
		if (num1 == num2) {
			return "both are equal.";
		}

		else {
			return "both are not equal.";
		}
	}

}
