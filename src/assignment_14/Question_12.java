/*
12. Write a program to generate IOException
*/
package assignment_14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Question_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("abc.txt");
		try {
			FileWriter fw = new FileWriter(f);
			
			// Intentionally cause an IOException by closing the writer prematurely
            fw.close();
            
            // This will cause an IOException because the writer is already closed
            fw.write("This will cause an IOException");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
