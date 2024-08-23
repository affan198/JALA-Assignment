/*
14. Write a program to generate NoSuchMethodException
*/
package assignment_14;

import java.lang.reflect.Method;

public class Question_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<Question_14> clazz = Question_14.class;
		try {
			Method method = clazz.getMethod("m1");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
