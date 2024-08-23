/*
12. Converting Numbers to Strings with valueOf()
*/
package assignment_6;

public class Question_12 {

	public static void main(String[] args) {

		String valueOf = String.valueOf(false);
		System.out.println(valueOf);
		String valueOf2 = String.valueOf('a');
		System.out.println(valueOf2);
		String valueOf3 = String.valueOf(new char[] { 'a', 'f', 'f', 'a', 'n' });
		System.out.println(valueOf3);
		String valueOf4 = String.valueOf(88.65);
		System.out.println(valueOf4);
		String valueOf5 = String.valueOf(98.54f);
		System.out.println(valueOf5);
		String valueOf6 = String.valueOf(5677);
		System.out.println(valueOf6);
		String valueOf7 = String.valueOf(87765445676l);
		System.out.println(valueOf7);

		Question_12 obj = new Question_12();
		String valueOf8 = String.valueOf(obj);
		System.out.println(valueOf8);

	}

}
