/*
7. Write a program with finally block
*/
package assignment_14;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("try block executed");
			System.out.println(5/0);
		} catch (Exception e) {
			System.out.println("catch block executed");
			e.printStackTrace();
		}finally {
			System.out.println("finally block executed");
			sc.close();
			
		}

	}

}
