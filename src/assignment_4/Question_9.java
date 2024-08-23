/*
9. Write a function to reverse an array of integer values
*/
package assignment_4;

import java.util.Arrays;

public class Question_9 {

	int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {

		Question_9 obj = new Question_9();
		System.out.println("original array :" + Arrays.toString(obj.arr));
		int[] reverse = obj.reverse();
		System.out.println("reversed array : " + Arrays.toString(reverse));

	}

	public int[] reverse() {

		int init = 0;
		int[] rev = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			rev[init] = arr[i];
			init++;
		}

		return rev;
	}

}
