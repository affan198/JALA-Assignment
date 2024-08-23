/*
5. Create two interfaces with the same method (same signature) in both the interfaces. 
Implement these two interfaces in one class. Call the method.
*/
package assignment_10;

public class Question_5 {

	public static void main(String[] args) {

		Interface1 interface1 = new InterfaceChild();
		Interface2 interface2 = new InterfaceChild();
		interface1.method();
		interface2.method();
	}

}

interface Interface1{
	void method();
}

interface Interface2{
	void method();
}

class InterfaceChild implements Interface1,Interface2{

	@Override
	public void method() {
		System.out.println("InterfaceChild.method()");
	}
	
	
}

