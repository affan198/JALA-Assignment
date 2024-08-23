/*
5. Programs on Logical AND,OR operator and Logical NOT
*/
package assignment_2;

public class Question_5 {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		int c = 5;

		if(a<b && c>a) {
			System.out.println("this is logical AND condition.");
			System.out.println("if first condition is true it will check second condition otherwise it will not check");
		}
		System.out.println("=================================================");
		if(a>b || c>a) {
			System.out.println("this is logical OR condition.");
			System.out.println("if first condition is true it will not check second condition.");
		}
		System.out.println("=================================================");
		if(!(b>c)) {
			System.out.println("this is logical NOT condition.");
			System.out.println("if condition is true, it will convert to false and wiseversa");
		}
	}

}
