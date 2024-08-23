/*
17. Write a method to verify if the array contains two specified elements(12,23)
*/
package assignment_4;

public class Question_17 {

	int[] arr = new int[] { 1, 2, 3, 5, 12, 2, 76, 5, 23, 3, 99, 7, 8, 4, 6, 1 };

	public static void main(String[] args) {

		Question_17 obj = new Question_17();
		System.out.println("does given elements present in an array : " + obj.isPresentElements(12, 23));
	}

	public boolean isPresentElements(int x, int y) {
		int count = 0;
		for (int a : arr) {
			if (a == x || a == y) {
				count++;
			}
		}

		if (count >= 2) {
			return true;
		} else {
			return false;
		}
	}

}
