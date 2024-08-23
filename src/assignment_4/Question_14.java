/*
14. Write a method to find the second largest number in an array
*/
package assignment_4;

public class Question_14 {

	private int[] arr = new int[] { 1, 2, 3, 5, 2, 76, 5, 3, 99, 7, 8, 4, 6, 1 };

	int max = Integer.MIN_VALUE;

	public static void main(String[] args) {

		Question_13 obj = new Question_13();
		int secondLargestElement = obj.secondLargestElement(obj.arr);
		System.out.println(secondLargestElement);

	}

	public int secondLargestElement(int[] a) {

		// first way of finding second largest element in an array

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		int seconMmax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if ((a[i] > seconMmax) && a[i] < max) {
				seconMmax = a[i];
			}
		}

		return seconMmax;

	}
}
