/*
2. Print the fields/instance members of the parent class using super
*/
package assignment_11;

public class Question_2 {

	public static void main(String[] args) {

		Child child = new Child();
		
		child.superAndChildFields();
	}

}

class Parent{
	protected int age = 26;
	protected String name = "affan";
}

class Child extends Parent{
	protected int age = 24;
	protected String name = "atif";
	public void superAndChildFields() {
		System.out.println(super.age);
		System.out.println(super.name);
		System.out.println(this.age);
		System.out.println(this.name);
		
	}
}
