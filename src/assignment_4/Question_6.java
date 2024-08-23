/*
6. Write a function to copy an array to another array
*/
package assignment_4;

import java.util.Arrays;

public class Question_6 {

	public static void main(String[] args) {

		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		int[] copyArr = new int[arr.length];
		
		for(int i=0; i<arr.length;i++) {
			copyArr[i]=arr[i];
		}
		
		System.out.println("original array  "+ Arrays.toString(arr));
		System.out.println("copy array  "+Arrays.toString(copyArr));
		
		arr[3]=66;
		copyArr[6]=123;
		
		System.out.println("original modified array  "+ Arrays.toString(arr));
		System.out.println("copy modified array  "+ Arrays.toString(copyArr));
	}

}
