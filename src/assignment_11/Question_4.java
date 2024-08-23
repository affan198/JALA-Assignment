/*
4. Call argument constructor of current class using this()
*/
package assignment_11;

public class Question_4 {

	private int age;
	private String name;

	public Question_4() {
		this(26, "affan");
		System.out.println("no argument constructor Question_3.Question_3()");
	}

	public Question_4(int age, String name) {
		super();
		System.out.println("argument constructor Question_3.Question_3()");
		this.age = age;
		this.name = name;
	}

	public void fields() {
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args) {

		Question_3 obj = new Question_3();
		obj.fields();
	}

}
