/*
1. Write a function to add integer values of an array
*/
package assignment_4;

import java.util.Arrays;

public class Question_1 {

	static int[] arr = new int[30];

	public static void main(String[] args) {

		Question_1 obj = new Question_1();
		obj.addValue(0, 35);
		obj.addValue(2, 55);
		System.out.println(Arrays.toString(arr));
		
		obj.addValue(0, 35);
		//obj.addValue(-1, 55);
		System.out.println(Arrays.toString(arr));
	}
	
	public void addValue(int index, int value) {
		int length = arr.length;
		if(index>=0 && index<length) {
			arr[index]=value;
		}
		else {
			System.err.println("index out of bound");
			arr[index]=value; // it will give array index out of bound
		}
	}

}
