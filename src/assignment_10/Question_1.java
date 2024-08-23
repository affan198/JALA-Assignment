/*
1. Create an interface with only one method and implement it in a class. Call the method 
implemented.
*/
package assignment_10;

public class Question_1 {

	public static void main(String[] args) {

		B  b = new B();
		
		b.m1();
	}

}

interface A{
	public abstract void m1();
}

class B implements A{

	@Override
	public void m1() {

		System.out.println("B.m1()");
	}
	
}
