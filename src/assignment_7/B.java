package assignment_7;

public class B extends A{
	
	protected int vr =34;

	public char firstMethodOfB() {
		System.out.println("B.firstMethodOfB()");
		return 'a';
	}
	
	public char secondMethodOfB() {
		System.out.println("B.secondMethodOfB()");
		return 'a';
	}
	
	@Override
	public String generalmethod() {
		System.out.println("A.generalmethod()");
		System.out.println("method overriden in B class");
		return "general method of B class";
	}
}
