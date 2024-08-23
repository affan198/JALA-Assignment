/*
2. Call the constructors(both default and argument constructors) of super class from a child 
class
*/
package assignment_12;

public class Question_2 {

	public static void main(String[] args) {

		ChildC childC1= new ChildC();
		ChildC childC2 = new ChildC(26,"affan");
	}

}

class ParentC {
	private int age;
	private String name;

	public ParentC() {
		super();

		System.out.println("no-agr constructor of super class");
	}

	public ParentC(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		System.out.println("all-agr constructor of super class");
	}

}

class ChildC extends ParentC {

	public ChildC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChildC(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}
	
}







