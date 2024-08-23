/*
5. Call constructor of the parent class using super()
*/
package assignment_11;

public class Question_5 {

	public static void main(String[] args) {

		ChildA childA = new ChildA();
	}

}

class ParentsA{

	public ParentsA() {
		super();
		System.out.println("constructor of parentsA class invoked");
	}
	
}

class ChildA extends ParentsA{

	public ChildA() {
		super();
		System.out.println("child class constructor");
	}
	
}
