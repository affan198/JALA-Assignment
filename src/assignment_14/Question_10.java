/*
10. Write a program to generate ClassNotFoundException
*/
package assignment_14;

public class Question_10 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Class<?> forName;
		try {
			forName = Class.forName("Affan");
			System.out.println(forName.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
