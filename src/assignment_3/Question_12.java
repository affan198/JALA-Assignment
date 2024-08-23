/*
12. Print gender (Male/Female) program according to given M/F using switch
*/
package assignment_3;

import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter character f/m/o : ");
		String gender = sc.nextLine();

		switch (gender) {
		case "f":
		case "F": {
			System.out.println("this is for female gender");
		}break;
		case "m":
		case "M": {
			System.out.println("this is for male gender");
		}break;
		case "o":
		case "O": {
			System.out.println("this is for other gender");
		}break;
		default:
			System.out.println("please enter proper gender code : ");
		}
		sc.close();
	}

}
