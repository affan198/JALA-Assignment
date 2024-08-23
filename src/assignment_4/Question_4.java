/*
4. Write a function to test if array contains a specific value
*/
package assignment_4;

public class Question_4 {

	int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {

		Question_4 obj = new Question_4();
		System.out.println(obj.containsValue(39));

	}

	public boolean containsValue(int value) {
		for (int a : arr) {
			if (a == value) {
				return true;
			}
		}
		return false;
	}

}
