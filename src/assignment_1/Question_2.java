/*
2. Write a program to print your name

*/
package assignment_1;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using variable
		String name1 = "AFFAN";
		System.out.println("your name is : " + name1);

		// using console
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("your name is : " + name);
		sc.close();
	}

}
