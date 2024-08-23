/*
2. Write a method for increment and decrement operators(++, --)
*/
package assignment_2;

public class Question_2 {

	public static void main(String[] args) {

		double a = 5.4;

		Question_2 operator = new Question_2();

		System.out.println("before increament a = " + a);
		double inc = operator.increament(a);
		System.out.println("after increament a = " + inc);

		System.out.println("before decreament a = " + a);
		double dec = operator.increament(a);
		System.out.println("after decreament a = " + dec);

	}

	public double increament(double d) {
		return ++d;
	}

	public double decreament(double d) {
		return --d;
	}

}
