/*
11. Write a program to generate FileNotFoundException
*/
package assignment_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("C:/Users/affan/Desktop/abc.txt");
		try {
			FileReader fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	}

}
