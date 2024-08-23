/*
8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
*/
package assignment_6;

public class Question_8 {

	public static void main(String[] args) {

		String name = "affan";
		boolean equalsIgnoreCase = name.equalsIgnoreCase("AFFAN");
		System.out.println(equalsIgnoreCase);
		
		boolean startsWith = name.startsWith("n");
		System.out.println(startsWith);
		
		boolean endsWith = name.endsWith("n");
		System.out.println(endsWith);
		
		int compareTo = name.compareTo("AFFAN");
		System.out.println(compareTo);
	}

}
