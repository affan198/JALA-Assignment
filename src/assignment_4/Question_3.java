/*
3. Write a program to find the index of an array element
*/
package assignment_4;

public class Question_3 {

	int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {

		Question_3 obj = new Question_3();
		int index = obj.findIndex(7);
		System.out.println(index);

	}

	public int findIndex(int value) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		System.out.println(value + " is not present in an given array");
		return -1;
	}

}
