/*
18. Write a program to remove the duplicate elements and return the new array
*/
package assignment_4;

import java.util.Arrays;

public class Question_18 {

	int[] arr = new int[] { 1, 2, 3, 5, 2, 76, 5, 3, 99, 7, 8, 4, 6, 1 };
	private int[] freq;
	
	private int max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Question_12 obj = new Question_12();
		int[] removeDuplicates = obj.removeDuplicates(obj.arr);
		System.out.println(Arrays.toString(removeDuplicates));
	
	}

	public int[] removeDuplicates(int[] a) {
		// finding maximum value
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		freq = new int[max+1];
		
		
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]] += 1;
		}
		int count=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1) {
				count++;
			}
		}
		int[] unique = new int[arr.length-count];
		int p=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>=1) {
				unique[p]=i;
				p++;
			}
		}
		
		return unique;
	}

}

