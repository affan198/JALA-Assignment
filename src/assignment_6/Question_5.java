/*
5. Searching in strings using indexOf()
*/
package assignment_6;

public class Question_5 {

	public static void main(String[] args) {

		String name = "AFFAN AHMAD";
		int indexOf = name.indexOf('M');
		System.out.println(indexOf);
		
		int indexOf2 = name.indexOf("AHMAD");
		System.out.println(indexOf2);
		
		int lastIndexOf = name.lastIndexOf('A');
		System.out.println(lastIndexOf);
		
		int lastIndexOf2 = name.lastIndexOf("F");
		System.out.println(lastIndexOf2);
	}

}
