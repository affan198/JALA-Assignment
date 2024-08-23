/*
13. Write a program to generate NoSuchFieldException
*/
package assignment_14;

import java.lang.reflect.Field;

public class Question_13 {

	public static void main(String[] args) {

		try {
            // Attempt to access a non-existent field in the ExampleClass
            Class<Question_13> clazz = Question_13.class;
            Field field = clazz.getDeclaredField("nonExistentField");
        } catch (NoSuchFieldException e) {
            // Catch the NoSuchFieldException and print a message
            System.out.println("NoSuchFieldException caught: " + e.getMessage());
            e.printStackTrace();
        }
	}

}
