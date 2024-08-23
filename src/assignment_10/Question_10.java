/*
10. Create an interface with private, public and protected fields.
*/
package assignment_10;

public class Question_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface PQR{
	//private int a = 20;  // private access modifier in not allowed for interface field
	public int b  = 30;
	//protected c = 40;  // protected access modifier in not allowed for interface field
	
	// all variable of interface is by default public static final.
	final int x = 10;
	static int y = 20;
	public int z = 90;
	public static final int q = 66;
	
}
