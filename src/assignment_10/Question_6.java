/*
6. Create an interface with a default method and implement it in a class. Do not provide 
implementation to the default method and call the method
*/
package assignment_10;

public class Question_6 {

	public static void main(String[] args) {

		IntrafDefault intrafDefault = new IntrafDefaultChild();
		intrafDefault.method();
	}

}

interface IntrafDefault {
	public default void method() {

	}
}

class IntrafDefaultChild implements IntrafDefault {
	@Override
	public void method() {
		System.out.println("IntrafDefaultChild.method()");
	}
}
