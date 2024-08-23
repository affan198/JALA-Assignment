/*
19. Write a function to find the missing number of sorted array of 1 to 100
*/
package assignment_4;

import java.util.Arrays;

public class Question_19 {

	int[] arr = new int[] { 5,6,7,8,9,10 };

	public static void main(String[] args) {

		Question_19 obj = new Question_19();

		int[] missingElements = obj.missingElements();
		System.out.println("missing elements : " + Arrays.toString(missingElements));

	}

	public int[] missingElements() {

		int len = arr.length;

		int missLen = 100 - len;

		int[] missingArr = new int[missLen];

		int p = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 1 && i == 0) {
				for (int j = 0; j < arr[i] - 1; j++) {
					missingArr[p++] = j + 1;
				}
			}

			else if (i <= len - 2) {
				if ((arr[i] - arr[i + 1] != 0) && (arr[i] - arr[i + 1] != -1) && (i != len - 1)) {
					for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
						missingArr[p++] = ++arr[i];
					}
				}
			}

			else if (i == (len - 1) && arr[i] < 100) {
				for (int j = arr[len - 1]; j < 100; j++) {
					missingArr[p++] = j + 1;
				}
			}

		}

		return missingArr;
	}

}
