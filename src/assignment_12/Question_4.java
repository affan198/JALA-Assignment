/*
4. Write constructors with return type int and String
*/
package assignment_12;

public class Question_4 {

	private int age;

	public  int Question_4() {
		//super();
		// TODO Auto-generated constructor stub
		return age;
	}

	public  String Question_4(int age) {
		//super();
		this.age = age;
		return "affan";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question_4 question_41 = new Question_4();
		System.out.println(question_41.Question_4());
		System.out.println(question_41.Question_4(26));

	}

}
