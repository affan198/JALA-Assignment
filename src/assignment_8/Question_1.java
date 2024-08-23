/*
1. Create a class with PRIVATE fields, private method and a main method. 
Print the fields in main method. Call the private method in main method
Create a sub class and try to access the private fields and methods from sub class
*/
package assignment_8;

public class Question_1 {
	
	private String name = "affan";

	public static void main(String[] args) {
		
		
		Question_1 obj = new Question_1();
		System.out.println("private instance variable : "+obj.name);
		
		String accessName = obj.accessName();
		System.out.println(accessName);
		
	}

	private String accessName() {
		System.out.println("Question_1.accessName()");
		return name;
	}
}


class subClass extends Question_1 {

	public static void main(String[] args) {

		subClass object = new subClass();
		
		//object.name; // it will give compilation error we cannot access private field from sub class
		//object.accessName(); // it will give compilation error we cannot access private method from sub class
	}

}
