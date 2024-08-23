/*
9. Write a program to find the prime or not.
*/
package assignment_3;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter number in nteger form : ");
		int number = Integer.parseInt(sc.nextLine());

		if (number <= 1) {
			System.out.println(number + " is not prime number.");
		} else {
			boolean flag = true;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println(number + " is prime number.");
			} else {
				System.out.println(number + " is not prime number");
			}
		}
		sc.close();

	}

}
