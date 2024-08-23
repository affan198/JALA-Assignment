/*
1. Different ways creating a string
*/
package assignment_6;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {

		// first way to create string.
		String str1 = "AFFAN";
		// second way to create string
		String str2 = new String("AFFAN");

		// third way to create string
		Scanner sc = new Scanner(System.in);
		String str3 = sc.nextLine();
		sc.close();
		
		System.out.println(str1+" "+str2+" "+str3);
	}

}
