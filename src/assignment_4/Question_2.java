/*
2. Write a function to calculate the average value of an array of integers
*/
package assignment_4;

public class Question_2 {

	int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {
		
		Question_2 obj = new Question_2();
		float avg = obj.calculateAverage();
		System.out.println("average value of array : "+avg);

	}

	public float calculateAverage() {
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		return sum / 2;
	}

}
