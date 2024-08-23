/*
3. Use Interface instances to call the implemented method in the implemented class
*/
package assignment_10;

public class Question_3 {

	public static void main(String[] args) {

		Parent p = new ChildOfParent();
		
		p.method();
	}

}

interface Parent{
	void method();
}

class ChildOfParent implements Parent{

	@Override
	public void method() {

		System.out.println("ChildOfParent.method()");
	}
	
}
