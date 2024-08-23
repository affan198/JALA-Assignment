/*
7. Write a function to insert an element at a specific position in the array
*/
package assignment_4;

import java.util.Arrays;

public class Question_7 {

	static int[] arr = new int[10];

	public static void main(String[] args) {
		
		insertElement(3, 55);
		//insertElement(13, 55); index out of bound exception
		System.out.println(Arrays.toString(arr));

	}

	public static void insertElement(int index, int element) {

		arr[index] = element;

	}

}
