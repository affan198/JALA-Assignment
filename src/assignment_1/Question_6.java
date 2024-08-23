/*
6. Write a function to print your name and call the function from main method
*/


package assignment_1;

public class Question_6 {
	
	String name ="AFFAN";

	public static void main(String[] args) {

		//create object
		Question_6 obj = new Question_6();
		//calling the method
		String nm = obj.yourName();
		System.out.println("your name is : "+nm);
		
		String fullName = obj.fullName();
		System.out.println("full name is : "+fullName);
		
	}
	
	public String yourName() {
		return name;
	}
	
	public String fullName() {
		return "AFFAN AHMAD";
	}

}
