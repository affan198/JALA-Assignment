/*
1. Write a class with 2 static variables, 2 Instance variables,
   2 static methods, 2 instance methods and a main method.
2. Print instance variables in static methods
3. Print static variables in Instance methods
4. Call instance methods in static methods
5. Call static methods in instance methods
6. Print all the static, instance variables in main method
7. Call static methods and instance methods in main method
*/
package assignment_5;

public class Question_1_to_5 {
	// two instance variable
	int ins1 = 3;
	int ins2 = 4;

	// two static variable
	static int stc1 = 5;
	static int stc2 = 6;

	public static void main(String[] args) {

		// 6. Print all the static, instance variables in main method
		System.out.println("Print all the static, instance variables in main method");
		System.out.println("static variable 1 : "+stc1);
		System.out.println("static variable 1 : "+stc2);
		
		Question_1_to_5 obj = new Question_1_to_5();
		System.out.println("instance variable 1 : "+obj.ins1);
		System.out.println("instance variable 2 : "+obj.ins2);
		
		// 7. Call static methods and instance methods in main method
		System.out.println("Call static methods and instance methods in main method");
		staticMethod1();
		staticMethod2();
		obj.instanceMethod1();
		obj.instanceMethod2();
		
	}

	// instance method
	public void instanceMethod1() {

		// 3. Print static variables in Instance methods
		System.out.println("Print static variables in Instance methods : " + stc1);
		// or
		// System.out.println("Print static variables in Instance methods :
		// "+Question_1.stc1);
	}

	// instance method
	public void instanceMethod2() {
		// 5. Call static methods in instance methods
		Question_1_to_5.staticMethod1();
	}

	// static method
	public static void staticMethod1() {

		// 2. Print instance variables in static methods
		Question_1_to_5 obj = new Question_1_to_5();

		System.out.println("Print instance variables in static methods : " + obj.ins1);

	}

	// static method
	public static void staticMethod2() {
		
		// 4. Call instance methods in static methods
		Question_1_to_5 obj = new Question_1_to_5();
		obj.instanceMethod1();
		

	}
}
