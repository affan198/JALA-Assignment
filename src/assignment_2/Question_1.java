/*
1. Write a function for arithmetic operators(+,-,*,/)
*/
package assignment_2;

public class Question_1 {

	public static void main(String[] args) {

		float a = 35;
		float b = 87.92f;

		Question_1 obj = new Question_1();
		// perform addition
		System.out.println("addition of " + a + " and " + b + " is : " + (float) obj.addition(a, b));

		// perform subtraction
		System.out.println("subtraction of " + a + " and " + b + " is : " + (float) obj.subtraction(a, b));

		// perform multiplication
		System.out.println("multiplication of " + a + " and " + b + " is : " + (float) obj.multiplication(a, b));

		// perform division
		System.out.println("division of " + a + " and " + b + " is : " + (float) obj.division(a, b));

	}

	public double addition(double num1, double num2) {
		return num1 + num2;
	}

	public double subtraction(double num1, double num2) {
		return num1 / num2;
	}

	public double multiplication(double num1, double num2) {
		return num1 * num2;
	}

	public double division(double num1, double num2) {
		return num1 / num2;
	}

}
// this is output
/*
 * addition of 35.0 and 87.92 is : 122.92 
 * subtraction of 35.0 and 87.92 is :
 * 0.39808917 multiplication of 35.0 and 87.92 is : 3077.2 
 * division of 35.0 and
 * 87.92 is : 0.39808917
 */
