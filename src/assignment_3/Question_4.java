/*
4. Write a program to print the odd and even numbers.
*/
package assignment_3;

public class Question_4 {

	public static void main(String[] args) {

		// printing even number between 1 to 20
		System.out.println("printing even number");
		even();
		// printing odd number between 1 to 20
		System.out.println("printing odd number");
		odd();
	}

	public static void even() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void odd() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
