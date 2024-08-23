/*
4. Create two interfaces with one method each. Implement these two interfaces in one 
class.
*/
package assignment_10;

public class Question_4 {

	public static void main(String[] args) {
		
		Intraf1 intraf1 = new IntrafCh();
		Intraf2 intraf2 = new IntrafCh();
		
		intraf1.method1();
		intraf2.method2();

	}

}

interface Intraf1{
	void method1();
}

interface Intraf2{
	void method2();
}

class IntrafCh implements Intraf1,Intraf2{

	@Override
	public void method1() {
		System.out.println("IntrafChild.method1()");
	}

	@Override
	public void method2() {
		System.out.println("IntrafChild.method2()");
		
	}
	
}





