/*
6. Use this() and super() in methods not in constructors
*/
package assignment_11;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ParentB {
	protected int age = 26;

}

class ChildB extends ParentB {
	private int age = 24;

	public void superAndChildFields() {
		System.out.println(super.age);
		// System.out.println(super().age); we can super() only in constructor, to call
		// super class constructor
		System.out.println(this.age);
		// System.out.println(this().age); we can use this() only in constructor , to
		// call current class constructor
	}
}
