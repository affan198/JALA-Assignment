/*
7. Create an interface and inherit it from the other interface.
*/
package assignment_10;

public class Question_7 {

	public static void main(String[] args) {

		Child child = new Child();
		
		child.parentIntrafMethod();
		child.childIntrafMethod();
	}

}

interface IntrafParent1{
	public default void parentIntrafMethod(){
		System.out.println("IntrafParent.parentMethod()");
	}
}

interface IntrafChild1 extends IntrafParent1{
	public default void childIntrafMethod() {
		System.out.println("IntrafChild.childMethod()");
	}
}

class Child implements IntrafChild1{
	
}
