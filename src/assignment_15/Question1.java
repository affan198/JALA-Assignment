/*
 * 1. Write a program to read text from .txt file using InputStream
*/
package assignment_15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\affan\\Desktop\\hello.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
			int i;
			while((i = fis.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
