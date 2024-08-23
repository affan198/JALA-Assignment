/*6. Write a program to write text to .txt file using FileWriter
*/
package assignment_15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\affan\\Desktop\\hello.txt");
		try {
			FileWriter fr = new FileWriter(f);
			String s = "write data in txt file using FileWriter.";
			fr.append(s);
			fr.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
