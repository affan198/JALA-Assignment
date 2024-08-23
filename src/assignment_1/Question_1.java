
/*
 * 1. How to create a class, object, method and its signature
*/
package assignment_1;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 
		 how to create class?
		 answer : using Eclipse ide write click on src -> select class -> give name -> finish.
		 
		 how to create object?
		 we can create object using new keyword and newInstance() method.
		 
		 how to create method?
		 answer : when we create method we have to take care of following things
		 1) access modifier 
		 2) return type.
		 3) method name.
		 4) argument type and how many parameter.
		 
		 given below is the example
		 
		 */
		
		Question_1 obj = new Question_1();
		String methodExample = obj.methodExample("I am calling method");
		System.out.println(methodExample);

	}
	
	public String methodExample(String parameter) {
		return parameter;
	}

}
