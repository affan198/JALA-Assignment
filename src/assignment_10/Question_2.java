/*
2. Create an interface with two methods, but implement only one in a class. Call the 
method implemented.
*/
package assignment_10;

public class Question_2 {

	public static void main(String[] args) {

		IntrafChild obj = new IntrafChild();
		
		System.out.println(obj.m1());
	}

}

interface Intraf {
	String m1() ;
	void m2();
}

class IntrafChild implements Intraf{

	@Override
	public String m1() {
		// TODO Auto-generated method stub
		return "this is m1() method";
	}

	// if you will not override any of the abstract method of Interface it will give compilation error.
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}


