/*
5. Try to call the constructor multiple times with the same object
*/
package assignment_12;

public class Question_5 {
	
	private static int a=0;
	
	public Question_5() {
		super();
		System.out.println("constructor call "+(++a)+ " times");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// we cannot call same constructor multiple time , only one time c=we can call.
		Question_5 obj1 = new Question_5();
		Question_5 obj2 = new Question_5();
	}

}
