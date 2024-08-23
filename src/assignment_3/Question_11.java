/*
11. Program to check whether a number is EVEN or ODD using switch
*/

package assignment_3;

import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter number in nteger form : ");
		int number = Integer.parseInt(sc.nextLine());
		
		if(number%2==0) {
			System.out.println(number+" is even number");
		}
		else {
			System.out.println(number+" is odd number");
		}
		sc.close();
	}

}
