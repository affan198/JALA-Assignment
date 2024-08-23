/*
4. Write a program with multiple catch blocks
*/
package assignment_14;

public class Question_4 {

	public static void main(String[] args) {
		try {
			// write  java code here  if there is a chance of exception .
			
			//it will give null pointer exception
			String s = null; 
			System.out.println(s.charAt(0)); 
			
			//it will give arithmetic exception
			System.out.println(5/0);
			
			//it will give ClassCastException
			Object object = new Object();
			String str = (String)object;
			System.out.println();
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("when number divided by zero");
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("working with null values");
			e.printStackTrace();
		}
		
		catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println("converiting higher class to lower class");
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle 
			System.out.println("any exception");
			e.printStackTrace();
		}
	}
}
