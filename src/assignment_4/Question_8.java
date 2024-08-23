/*
8. Write a function to find the minimum and maximum value of an array
*/
package assignment_4;

public class Question_8 {

	int[] arr = new int[] { 1, 2,2, 3,9, 4, 5,1, 6,2, 7, 8, 9 };
	int a = Integer.MAX_VALUE; // for finding the minimum value
	int b = Integer.MIN_VALUE; // for finding the maximum value

	public static void main(String[] args) {
		
		Question_8 obj = new Question_8();
		System.out.println("minimum element of an array : "+obj.minimumElement());
		System.out.println("maximum element of an array : "+obj.maximumElement());

	}

	public int minimumElement() {

		// assume all array element are positive integers.
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=a) {
				a= arr[i];
			}
		}

		return a;
	}

	public int maximumElement() {

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=b) {
				b= arr[i];
			}
		}

		return b;
	}

}
