/*
2. Create a class with DEFAULT fields and methods. Access these fields
   and methods from any other class in the same package
*/
package assignment_8;

public class Question_2 {

	public static void main(String[] args) {
		
		Temp temp = new Temp();
		
		System.out.println(temp.name);
		System.out.println(temp.accessName());

	}

}

class Temp {

	String name = "affan";

	String accessName() {
		return name;
	}

}
