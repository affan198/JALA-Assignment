/*
9. Write a program to generate ArrayIndexOutOfBoundException
*/
package assignment_14;

public class Question_9 {

	public static void main(String[] args) {


		int[] arr = new int[] {11,532,863,464,509,36,527};
		System.out.println(arr[3]);
		System.out.println(arr[0]);
		System.out.println(arr[8]); // here java.lang.ArrayIndexOutOfBoundsException will occur

	}

}
