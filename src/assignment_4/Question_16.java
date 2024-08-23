/*
16. Write a function to get the difference of largest and smallest value
*/
package assignment_4;

public class Question_16 {
	
	int[] arr = new int[] { 1, 2, 3, 5, 2, 76, 5, 3, 99, 7, 8, 4, 6, 1 };

	int max = Integer.MIN_VALUE; // for finding maximum value
	int min = Integer.MAX_VALUE; // for finding minimum value

	public static void main(String[] args) {

		Question_16 obj = new Question_16();
		
		System.out.println("diffrence between max and min value : "+obj.diffOfMinMax());
		
	}

	public int diffOfMinMax() {
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		return max-min;
	}
}
