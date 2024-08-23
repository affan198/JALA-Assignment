/*
1. Print the fields/instance members of the current class using this and without using object
*/
package assignment_11;

public class Question_1 {

	private int age = 26;
	String name = "AFFAN";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.method();

	}

}

class Test {
	private int age = 26;
	private String name = "AFFAN";
	
	public void method() {
		System.out.println(this.age);
		System.out.println(this.name);

	}

}
