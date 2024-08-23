/*
5. Write two methods with the same name, number of parameters and data type but 
different return Type
*/
package assignment_13;

public class Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean areEqual = areEqual(2, 4);
		System.out.println(areEqual);
		String concat = areEqual(4f, 79);
		System.out.println(concat);
	}

	public static boolean areEqual(int a, int b) {
		return a == b;
	}

	

	public static String areEqual(float a, int b) {
		return "concatenation  : "+a + b;
	}
}
