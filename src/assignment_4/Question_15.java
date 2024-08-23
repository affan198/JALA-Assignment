/*
15. Write a method to find number of even number and odd numbers in an array
*/
package assignment_4;

public class Question_15 {

	int[] arr = new int[] { 1, 2, 3, 5, 2, 76, 5, 3, 99, 7, 8, 4, 6, 1 };

	public static void main(String[] args) {
		
		Question_15 obj = new Question_15();
		
		System.out.println("total even numbers in an array : "+obj.countEven());
		System.out.println("total odd numbers in an array : "+obj.countOdd());

	}

	public int countEven() {
		int count = 0;
		for (int a : arr) {
			if (a % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	public int countOdd() {
		int count = 0;
		for (int a : arr) {
			if (a % 2 != 0) {
				count++;
			}
		}
		return count;
	}

}
