/*
8. Write a program to find Armstrong number or not
*/

package assignment_3;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {

		/*
		 * Definition:
		 * 
		 * number that is equal to the sum of its digits, each raised to the power of
		 * the number of digits
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("enter number in nteger form : ");
		int number = Integer.parseInt(sc.nextLine());

		// counting number of digits in given number.
		int temp1 = number;
		int count = 0;
		while (temp1 != 0) {
			count++;
			temp1 /= 10;
		}

		double sum = 0;
		int temp2 = number;
		for (int i = 1; i <= count; i++) {
			int lastDigit = temp2 % 10;
			sum += Math.pow(lastDigit, count);
			System.out.println(sum);
			temp2 /= 10;
		}
		if(number==sum) {
			System.out.println(number+" is Armstrong number.");
		}
		else {
			System.out.println(number+" is not Armstrong number.");
		}
		sc.close();
	}

}
