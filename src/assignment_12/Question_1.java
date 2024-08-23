/*
1. Write a class with a default constructor, one argument constructor and two argument 
constructors. Instantiate the class to call all the constructors of that class from a main 
class
*/
package assignment_12;

public class Question_1 {

	private int age;
	private String name;

	public Question_1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question_1(int age) {
		super();
		this.age = age;
	}

	public Question_1(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {

		Question_1 obj = new Question_1(26,"affan");
		
	}

}
