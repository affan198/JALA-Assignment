/*
 * 2. Write a program to write text to .txt file using OutputStream
*/
package assignment_15;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\affan\\Desktop\\hello.txt");
		try {
			FileOutputStream fos = new FileOutputStream(f);
			String s = "adding data to the file.";
			for(int i=0; i<s.length();i++){
				char charAt = s.charAt(i);
				fos.write(charAt);
			}
			System.out.println("data added successfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
