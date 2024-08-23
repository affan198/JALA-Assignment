/*
8. Create a PUBLIC interface with fields and methods, fields should have values assigned. 
Implement this interface to some class and print the values of the interface fields and 
call the interface methods
*/
package assignment_10;

public class Question_8 {

	public static void main(String[] args) {

		XYZ xyz = new ChildOfXYZ();
		System.out.println(XYZ.a);
		System.out.println(XYZ.name);
		xyz.method();
	}

}

interface XYZ{
	int a = 45;
	String name = "AFFAN";
	
	void method() ;
}

class ChildOfXYZ implements XYZ{

	@Override
	public void method() {
		System.out.println("ChildOfXYZ.method()");
	}
	
}


