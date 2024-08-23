/*
4. Write two methods with the same name and same number of parameters of different 
type and call from main method
*/
package assignment_13;

public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean areEqual = areEqual(2, 3);
		System.out.println(areEqual);
		
		boolean areEqual2 = areEqual(40f,40);
		System.out.println(areEqual2);

	}

	public static boolean areEqual(int a, int b) {
		return a == b;
	}

	

	public static boolean areEqual(float a, int b) {
		return a == b;
	}

}
