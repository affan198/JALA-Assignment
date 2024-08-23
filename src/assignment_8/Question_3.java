/*
3. Create a class with PROTECTED fields and methods. 
Access these fields and methods from any other class in the same package.
Also, Access the PROTECTED fields and methods from child class located
 in a different package Access the PROTECTED fields and methods 
 from any class in different package 
*/
package assignment_8;

class Main {

	public static void main(String[] args) {

		Question_3 obj = new Question_3();

		System.out.println(obj.name);
		System.out.println(obj.accessName());

	}

}

public class Question_3 {

	protected String name = "ahmad";

	protected String accessName() {
		return name;
	}

}