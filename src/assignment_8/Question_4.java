/*
4. Create a class with PUBLIC fields and methods. 
   Access the public methods and fields from any class in the same package
   or different package
*/
package assignment_8;

public class Question_4 {
	public String addr = "hydrabad";

	public String accessAddr() {
		return addr;
	}
}

class A{
	
	public static void main(String[] args) {
		Question_4 obj = new Question_4();
		System.out.println(obj.addr);
		System.out.println(obj.accessAddr());
	}
	
}