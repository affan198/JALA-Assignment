/*
A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B. 
Create three methods in each class, 2 methods are specific to each class and third 
method (override method) should be in all three Classes A, B and C
Create a class with main method. Create an object for each class A, B and C in main 
method and call every method of each class using its own object/instance.
Call an overridden method with super class reference to B and C class’s objects
Runtime polymorphism with Data Members/Instance variables, Repeat the above 
process only for data members
*/
package assignment_7;

public class Test {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		C c = new C();
		
		System.out.println(a.vr);
		System.out.println(b.vr);
		System.out.println(c.vr);
		
		
		int firstMethodOfA = a.firstMethodOfA();
		int secondMethodOfA = a.secondMethodOfA();
		
		char firstMethodOfB = b.firstMethodOfB();
		char secondMethodOfB = b.secondMethodOfB();
		
		boolean firstMethodOfC = c.firstMethodOfC();
		boolean secondMethodOfC = c.secondMethodOfC();
		
		String generalmethod = a.generalmethod();
		String generalmethod2 = b.generalmethod();
		String generalmethod3 = c.generalmethod();
		
		System.out.println(firstMethodOfA);
		System.out.println(secondMethodOfA);
		System.out.println(firstMethodOfB);
		System.out.println(secondMethodOfB);
		System.out.println(firstMethodOfC);
		System.out.println(secondMethodOfC);
		System.out.println(generalmethod);
		System.out.println(generalmethod2);
		System.out.println(generalmethod3);
		
		int firstMethodOfA3 = b.firstMethodOfA();
		int secondMethodOfA3 = b.secondMethodOfA();
		
		int firstMethodOfA2 = c.firstMethodOfA();
		int secondMethodOfA2 = c.secondMethodOfA();
		char firstMethodOfB2 = c.firstMethodOfB();
		char secondMethodOfB2 = c.secondMethodOfB();
		
		System.out.println(firstMethodOfA3);
		System.out.println(secondMethodOfA3);
		System.out.println(firstMethodOfA2);
		System.out.println(secondMethodOfA2);
		System.out.println(firstMethodOfB2);
		System.out.println(secondMethodOfB2);
	}

}
