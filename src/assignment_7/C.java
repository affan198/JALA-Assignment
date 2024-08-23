package assignment_7;

public class C extends B{
	
	protected int vr =10;

	public boolean firstMethodOfC() {
		System.out.println("C.firstMethodOfC()");
		return false;
	}
	
	public boolean secondMethodOfC() {
		System.out.println("C.secondMethodOfC()");
		return false;
	}
	
	@Override
	public String generalmethod() {
		System.out.println("A.generalmethod()");
		System.out.println("method overriden in C class");
		return "general method of C class";
	}
}
