/*
10. Write a program to palindrome or not
*/
package assignment_3;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter number in nteger form : ");
		int number = Integer.parseInt(sc.nextLine());

		String num = "" + number; // convert to String
		int len = num.length();
		int size = len / 2;
		boolean flag = false;
		for (int i = 0; i < size; i++) {
			if (num.charAt(i) == num.charAt(--len)) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println(number + " is palindrome");
		} else {
			System.out.println(number + " is not palindrome");
		}
		sc.close();
	}

}
