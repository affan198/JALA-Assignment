/*
5. Define the local and Global variables with the same name and print both variables and 
understand the scope of the variables
*/

package assignment_1;

public class Question_5 {

	static int var = 55;
	int ins = 39;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var = 33;
		int ins = 50;
		// accessing local variable inside method only
		System.out.println("this is local variable var=" + var);
		System.out.println("this is local variable ins=" + ins);
		// accessing global static variable anywhere in the program using class name.
		System.out.println("this is global static variable var=" + Question_5.var);
		
		Question_5 obj = new Question_5();
		
		// accessing global instance variable anywhere in the program using object reference.
		System.out.println("this is global instance variable var="+obj.ins);

	}

}
