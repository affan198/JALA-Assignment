/*
11. Splitting strings with split()
*/
package assignment_6;

import java.util.Arrays;

public class Question_11 {

	public static void main(String[] args) {

		String name = "AFFAN AHMAD";
		String[] split = name.split("");
		System.out.println(Arrays.toString(split));
		
		String[] split1 = name.split(" ");
		System.out.println(Arrays.toString(split1));
	}

}
