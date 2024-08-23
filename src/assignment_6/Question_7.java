/*
7. Comparing strings using the methods equals()
*/
package assignment_6;

public class Question_7 {

	public static void main(String[] args) {

		String name = "affan";
		boolean isTrue1 = name.equals("affan");
		System.out.println(isTrue1);
		boolean isTrue2 = name.equals("AFFAN");
		System.out.println(isTrue2);
		boolean equalsIgnoreCase = name.equalsIgnoreCase("AFFAN");
		System.out.println(equalsIgnoreCase);
	}

}
