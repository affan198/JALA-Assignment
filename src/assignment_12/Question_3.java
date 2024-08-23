/*
3. Apply private, public, protected and default access modifiers to the constructor
*/
package assignment_12;

public class Question_3 {

	public static void main(String[] args) {

		//Test123 test123a = new Test123(); we cannot invoked  private constructor from another class.
		Test123 test123b = new Test123(26);
		Test123 test123c = new Test123(26, "affan");
		Test123 test123d = new Test123(26, "affan", "hydrabad");
	}

}

class Test123 {

	private int age;
	private String name;
	private String addr;

	private Test123() {
		super();
		System.out.println("private constructor invoked");
	}

	Test123(int age) {
		super();
		this.age = age;
		System.out.println("default constructor invoked");
	}

	protected Test123(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		System.out.println("protected constructor invoked");
	}

	public Test123(int age, String name, String addr) {
		super();
		this.age = age;
		this.name = name;
		this.addr = addr;
		System.out.println("public constructor invoked");
	}

}
