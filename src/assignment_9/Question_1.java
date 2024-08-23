/*
1. Create an abstract class with abstract and non-abstract methods.
2. Create a sub class for an abstract class. Create an object in the child class for the 
abstract class and access the non-abstract methods
3. Create an instance for the child class in child class and call abstract methods
4. Create an instance for the child class in child class and call non-abstract methods
*/
package assignment_9;

abstract class Parent {

	public abstract String methodM1();
	
	public String methodM2() {
		System.out.println("Parent.methodM2()");
		return "this is general method of parent class";
	}

}

/*
 * 2. Create a sub class for an abstract class. Create an object in the child
 * class for the abstract class and access the non-abstract methods
 */
public class Question_1 extends Parent {
	
	public static void main(String[] args) {
		//Question_1 question_1 = new Question_1(); we cannot create object for abstract class
		
		//3. Create an instance for the child class in child class and call abstract methods
		Question_1 obj = new Question_1();
		System.out.println(obj.methodM1());
		
		//4. Create an instance for the child class in child class and call non-abstract methods
		System.out.println(obj.methodM2());
	}

	@Override
	public String methodM1() {
		System.out.println("Question_1.methodM1()");
		return "abstract method called which overriden in child class";
	}
	
}
