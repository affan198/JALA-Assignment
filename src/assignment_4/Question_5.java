/*
5. Write a function to remove a specific element from an array
*/
package assignment_4;

import java.util.Arrays;

public class Question_5 {

	int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int[] tempArr;

	public static void main(String[] args) {
		
		Question_5 ob = new Question_5();
		int[] updatedArr = ob.removeElement(3);
		System.out.println(Arrays.toString(updatedArr));

	}

	public int[] removeElement(int element) {

		boolean flag = false;
		for (int a : arr) {
			if (a == element) {
				flag = true;
				tempArr = new int[arr.length - 1];
				break;
			}
		}
		if (flag) {
			for (int i = 0, j = 0; i < arr.length; i++, j++) {
				if (arr[i] == element) {
					j--;
				}
				else {
					tempArr[j] = arr[i];
				}
			}
		}
		return tempArr;

	}
}
