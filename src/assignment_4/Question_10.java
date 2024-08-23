/*
10. Write a function to find the duplicate values of an array
*/
package assignment_4;

public class Question_10 {

	int[] arr = new int[] { 1, 2,8,1,77,8,9,2,55,6,2, 3, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {

		Question_10 obj = new Question_10();
		String duplicateElemetns = obj.duplicateElemetns();
		System.out.println(duplicateElemetns);
	}

	public String duplicateElemetns() {

		String elements = "";

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int p = -1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[j] != -1) {
					count++;
					if (count > 1) {
						p = arr[j];
						arr[j] = -1;

					}
				}
			}
			if (p != -1) {
				elements += p + " ";
			}
		}
		if (elements.isEmpty()) {
			return "no duplicate element available";
		} else {
			return elements;
		}

	}

}
