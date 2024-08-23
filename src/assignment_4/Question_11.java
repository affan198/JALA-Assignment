/*
11. Write a program to find the common values between two arrays
*/
package assignment_4;

public class Question_11 {

	int[] arr1 = new int[] { 1, 445, 6, 7, 3, 9, 13, 8 };
	int[] arr2 = new int[] { 55, 6, 8, 99, 1, 3, 4 };

	public static void main(String[] args) {

		Question_11 obj = new Question_11();
		String commonElements = obj.commonElements(obj.arr1, obj.arr2);
		System.out.println(commonElements);

	}

	public String commonElements(int[] a, int[] b) {

		String common = "";

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					common += b[j] + " ";
				}
			}
		}
		if (common.isEmpty()) {
			return "no common element between two array";
		} else {
			return common;
		}
	}

}
