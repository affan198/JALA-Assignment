/*5. Write a program to read text from .txt file using FileReader
*/
package assignment_15;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\affan\\Desktop\\hello.txt");
		try {
			FileReader fr = new FileReader(f);
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
